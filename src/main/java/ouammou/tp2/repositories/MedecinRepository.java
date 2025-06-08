package ouammou.tp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.tp2.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
