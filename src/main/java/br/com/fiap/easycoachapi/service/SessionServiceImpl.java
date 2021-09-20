package br.com.fiap.easycoachapi.service;

import br.com.fiap.easycoachapi.dto.SessionDTO;
import br.com.fiap.easycoachapi.dto.UpdateSessionDTO;
import br.com.fiap.easycoachapi.entity.Session;
import br.com.fiap.easycoachapi.repository.SessionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SessionServiceImpl implements SessionService {
    private SessionRepository repository;

    public SessionServiceImpl(SessionRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SessionDTO> listSessions() {
        List<Session> sessions = repository.findAll();
        return sessions
                .stream()
                .map(SessionDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public SessionDTO getById(Integer id) {
        return new SessionDTO(findSessionById(id));
    }

    @Override
    public SessionDTO createNewSession(SessionDTO newSessionDTO) {
        Session newSession = new Session(newSessionDTO);
        Session newSessionSaved = repository.save(newSession);
        return new SessionDTO(newSessionSaved);
    }

    @Override
    public SessionDTO updateSession(Integer id, UpdateSessionDTO sessionUpdatedDTO) {
        Session existingSession = findSessionById(id);
        existingSession.setScheduledDateTime(sessionUpdatedDTO.getScheduledDateTime());
        existingSession.setDescription(sessionUpdatedDTO.getDescription());
        existingSession.setTitle(sessionUpdatedDTO.getTitle());
        existingSession.setInviteUrl(sessionUpdatedDTO.getInviteUrl());
        existingSession.setHasCancellationFee(sessionUpdatedDTO.getHasCancellationFee());
        Session sessionSaved = repository.save(existingSession);
        return new SessionDTO(sessionSaved);
    }

    @Override
    public void deleteSession(Integer id) {
        Session existingSession = findSessionById(id);
        repository.delete(existingSession);
    }

    private Session findSessionById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
