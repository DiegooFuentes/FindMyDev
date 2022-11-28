package cl.findmydev.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.findmydev.web.models.Postulante;

@Repository
public interface PostulanteRepository extends JpaRepository<Postulante, Long> {

}
