package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.entitiy.Applyentity2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplyRepository2 extends JpaRepository<Applyentity2,String > {

    Optional<Applyentity2> findByNAME(String NAME);
}
