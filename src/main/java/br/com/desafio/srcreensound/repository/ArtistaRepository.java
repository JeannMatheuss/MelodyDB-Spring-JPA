package br.com.desafio.srcreensound.repository;

import br.com.desafio.srcreensound.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
