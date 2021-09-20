package br.com.fiap.easycoachapi.repository;

import br.com.fiap.easycoachapi.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Integer> {
}
