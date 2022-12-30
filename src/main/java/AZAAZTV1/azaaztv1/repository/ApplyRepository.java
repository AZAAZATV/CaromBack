package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplyRepository extends JpaRepository<Applyentity,String > {

    Optional<Applyentity> findByNAME(String NAME);

}
