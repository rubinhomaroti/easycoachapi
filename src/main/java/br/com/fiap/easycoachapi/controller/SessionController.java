package br.com.fiap.easycoachapi.controller;

import br.com.fiap.easycoachapi.dto.SessionDTO;
import br.com.fiap.easycoachapi.dto.UpdateSessionDTO;
import br.com.fiap.easycoachapi.service.SessionService;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sessions")
public class SessionController {

    private SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @GetMapping
    public List<SessionDTO> getSessions() {
        return sessionService.listSessions();
    }

    @GetMapping("{id}")
    public SessionDTO getSessionById(@PathVariable Integer id) {
        return sessionService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SessionDTO createSession(@RequestBody SessionDTO newSessionDTO) {
        return sessionService.createNewSession(newSessionDTO);
    }

    @PutMapping("{id}")
    public SessionDTO updateSession(@RequestBody UpdateSessionDTO updateSessionDTO, @PathVariable Integer id) {
        return sessionService.updateSession(id, updateSessionDTO);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSession(@PathVariable Integer id) {
        sessionService.deleteSession(id);
    }
}
