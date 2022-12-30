package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.ApplyEntity2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplyRepository2 extends JpaRepository<ApplyEntity2,String > {

    Optional<ApplyEntity2> findByNAME(String name);
}