package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplyRepository extends JpaRepository<ApplyEntity,String > {
    Optional<ApplyEntity> findByNAME(String name);

}