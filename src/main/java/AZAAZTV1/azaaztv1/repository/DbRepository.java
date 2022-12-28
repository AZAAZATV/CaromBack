package AZAAZTV1.azaaztv1.repository;

import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DbRepository extends JpaRepository<DbEntity,String> {
   /*List<Dbentity> searchParamRepo(@Param("ID") String ID); //딱히 필요있지는 않음*/
}
