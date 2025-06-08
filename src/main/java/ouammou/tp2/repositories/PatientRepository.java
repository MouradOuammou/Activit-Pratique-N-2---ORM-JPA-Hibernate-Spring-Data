package ouammou.tp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.tp2.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String nom);

}
