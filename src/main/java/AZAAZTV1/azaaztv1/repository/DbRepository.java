package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface DbRepository extends JpaRepository<DbEntity,String> {
   //List<DbEntity> searchParamRepo(@Param("ID") String id); //딱히 필요있지는 않음
}
