package AZAAZTV1.azaaztv1.Controller;

import AZAAZTV1.azaaztv1.dto.Dto;
import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import AZAAZTV1.azaaztv1.service.Dbservice;
import AZAAZTV1.azaaztv1.service.impl.DbServiceImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/signup")
public class DbCon {
    private final DbRepository dbRepository;

//http://10.82.18.67:1004/signup/insert?ID=asbcd&PASSWORD=1004&NAME=geher&CLASS=1-3-5

   /*  @GetMapping("/insert") //insert
    public String insertMember(@RequestParam(value="ID") String ID, @RequestParam(value = "PASSWORD") int PASSWORD, @RequestParam(value = "NAME") String NAME, @RequestParam(value = "CLASS") String CLASS) {
        if(dbRepository.findById(ID).isPresent()) {
            return "동일한 아이디가 이미 있습니다";
        }
         else {
            Dbentity entity = Dbentity.builder().ID(ID).PASSWORD(PASSWORD).NAME(NAME).CLASS(CLASS).build();
            dbRepository.save(entity);
            return "아이디 : " + ID + " 비밀번호 : " + PASSWORD + " 본인 이름 : "+NAME+" 학번  : "+CLASS+" 으로 가입되었습니다";
        }
    }*/

//http://10.82.18.67:1004/signup/insert
//    @PostMapping(value = "/insert")
//    public String insertMember(@RequestBody Dto dto){
//        return dto.toString();
//    }

    @PostMapping("/insert")
    public ResponseEntity<Dto> signUp(@RequestBody Dto dto){

        Dbentity dbentity = Dbentity.builder()
                .ID(dto.getID())
                .CLASS(dto.getCLASS())
                .NAME(dto.getNAME())
                .PASSWORD(dto.getPASSWORD())
                .build();

        dbRepository.save(dbentity);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }



}
