package AZAAZTV1.azaaztv1.Controller;

import AZAAZTV1.azaaztv1.dto.Dto;
import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/signup")
public class DbCon {
    private final DbRepository dbRepository;


     @GetMapping("/insert") //insert
    public String insertMember(@RequestParam(value="ID") String ID, @RequestParam(value = "PASSWORD") int PASSWORD, @RequestParam(value = "NAME") String NAME, @RequestParam(value = "CLASS") String CLASS) {
        if(dbRepository.findById(ID).isPresent()) {
            return "동일한 아이디가 이미 있습니다";
        }
         else {
            Dbentity entity = Dbentity.builder().ID(ID).PASSWORD(PASSWORD).NAME(NAME).CLASS(CLASS).build();
            dbRepository.save(entity);
            return "아이디 : " + ID + " 비밀번호 : " + PASSWORD + " 본인 이름 : "+NAME+" 학번  : "+CLASS+" 으로 가입되었습니다";
        }
    }


/*    @PostMapping("/insert")
    public void signUp(@RequestBody Dto dto){

        Dbentity dbentity = Dbentity.builder()
                .ID(dto.getID())
                .CLASS(dto.getCLASS())
                .NAME(dto.getNAME())
                .PASSWORD(dto.getPASSWORD())
                .build();

        dbRepository.save(dbentity);
    }*/


    @GetMapping("/search") //selecte*from azaaztv
    public String searchAllMember() {
        return dbRepository.findAll().toString();
    }




}
