package AZAAZTV1.azaaztv1.Controller;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.entitiy.Applyentity2;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import AZAAZTV1.azaaztv1.repository.ApplyRepository2;
import AZAAZTV1.azaaztv1.service.ApplyService;
import AZAAZTV1.azaaztv1.service.ApplyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/apply")
public class ApplyCon {
    private final ApplyRepository applyRepository;
    private final ApplyService applyService;
    private final ApplyRepository2 applyRepository2;
    private final ApplyService2 applyService2;

    @PostMapping("/applyinfo1") //첫번째 신청하기 테이블
    public ResponseEntity<ApplyDto> regsiter(@RequestBody ApplyDto applyDto){

        Applyentity applyentity = Applyentity.builder()
                .CLASS(applyDto.getCLASS())
                .NAME(applyDto.getNAME())
                .build();

        applyRepository.save(applyentity);
       return new ResponseEntity<>(applyDto, HttpStatus.OK);
    }

    @GetMapping("/applyinfoout1")
    public ResponseEntity<Applyentity> applyoutput1(@RequestParam(value="NAME") String NAME){
        return new ResponseEntity<>(applyService.getApply(NAME), HttpStatus.OK);
    }

    @GetMapping("/applyinfolist")
    public ResponseEntity<List<Applyentity>> applyoutputlist1(){
        return new ResponseEntity<>(applyRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/applyinfo2") //두번째 신청하기 테이블
    public ResponseEntity<ApplyDto> regsiter2(@RequestBody ApplyDto applyDto){

        Applyentity2 applyentity = Applyentity2.builder()
                .CLASS(applyDto.getCLASS())
                .NAME(applyDto.getNAME())
                .build();

        applyRepository2.save(applyentity);
        return new ResponseEntity<>(applyDto, HttpStatus.OK);
    }

    @GetMapping("/applyinfoout2")
    public ResponseEntity<Applyentity2> ouapplytput2(@RequestParam(value="NAME") String NAME){
        return new ResponseEntity<>(applyService2.getApply(NAME), HttpStatus.OK);
    }

    @GetMapping("/applyinfolist2")
    public ResponseEntity<List<Applyentity2>> applyoutputlist2(){
        return new ResponseEntity<>(applyRepository2.findAll(), HttpStatus.OK);
    }
//delete 기능

/*    @DeleteMapping("/applydelete{NAME}")
    public String delete(@PathVariable String NAME){
        applyService.delete(NAME);
        return "삭제됨1";
    }*/
}

