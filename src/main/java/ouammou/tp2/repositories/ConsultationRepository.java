package ouammou.tp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.tp2.entities.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
