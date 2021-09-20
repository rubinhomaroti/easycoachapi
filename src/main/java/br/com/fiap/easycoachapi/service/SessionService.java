package br.com.fiap.easycoachapi.service;

import br.com.fiap.easycoachapi.dto.SessionDTO;
import br.com.fiap.easycoachapi.dto.UpdateSessionDTO;

import java.util.List;

public interface SessionService {
    List<SessionDTO> listSessions();
    SessionDTO createNewSession(SessionDTO newSessionDTO);
    SessionDTO getById(Integer id);
    SessionDTO updateSession(Integer id, UpdateSessionDTO sessionUpdatedDTO);
    void deleteSession(Integer id);
}
