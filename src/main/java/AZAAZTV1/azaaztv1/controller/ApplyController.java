package AZAAZTV1.azaaztv1.controller;

import AZAAZTV1.azaaztv1.dto.response.ApplyResponse;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity2;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import AZAAZTV1.azaaztv1.repository.ApplyRepository2;
import AZAAZTV1.azaaztv1.service.ApplyService;
import AZAAZTV1.azaaztv1.service.ApplyService2;
import AZAAZTV1.azaaztv1.service.impl.ApplyServiceImpl;
import AZAAZTV1.azaaztv1.service.impl.ApplyServiceImpl2;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/apply")
public class ApplyController {
    private final ApplyRepository applyRepository;
    private final ApplyServiceImpl applyService;
    private final ApplyRepository2 applyRepository2;
    private final ApplyServiceImpl2 applyService2;

    @PostMapping("/applyinfo1")
    public ResponseEntity<ApplyResponse> regsiter(@RequestBody ApplyResponse applyResponse){

        ApplyEntity applyEntity = ApplyEntity.builder()
                .CLASS(applyResponse.getCLASS())
                .NAME(applyResponse.getNAME())
                .build();

        applyRepository.save(applyEntity);
        return new ResponseEntity<>(applyResponse, HttpStatus.CREATED);
    }

    @GetMapping("/applyinfoout1")
    public ResponseEntity<ApplyEntity> applyoutput1(@RequestParam(value="NAME") String name){
        return new ResponseEntity<>(applyService.getApply(name), HttpStatus.OK);
    }

    @GetMapping("/applyinfolist")
    public ResponseEntity<List<ApplyEntity>> applyoutputlist1(){
        return new ResponseEntity<>(applyRepository.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/applydelete")
    public String deleteApply(@RequestBody @Valid ApplyResponse applyResponse) {
        if(applyService.deleteApply(applyResponse)) {
            return "삭제됨1";
        }
        return "삭제 실패!";
    }

    @PostMapping("/applyinfo2")
    public ResponseEntity<ApplyResponse> regsiter2(@RequestBody ApplyResponse applyResponse){

        ApplyEntity2 applyEntity2 = ApplyEntity2.builder()
                .CLASS(applyResponse.getCLASS())
                .NAME(applyResponse.getNAME())
                .build();

        applyRepository2.save(applyEntity2);
        return new ResponseEntity<>(applyResponse, HttpStatus.OK);
    }

    @GetMapping("/applyinfoout2")
    public ResponseEntity<ApplyEntity2> applyoutput2(@RequestParam(value="NAME") String name){
        return new ResponseEntity<>(applyService2.getApply(name), HttpStatus.OK);
    }

    @GetMapping("/applyinfolist2")
    public ResponseEntity<List<ApplyEntity2>> applyoutputlist2(){
        return new ResponseEntity<>(applyRepository2.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/applydelete2")
    public String deleteApply2(@RequestBody @Valid ApplyResponse applyResponse) {
        if(applyService2.deleteApply(applyResponse)) {
            return "삭제됨2";
        }
        return "삭제 실패!!22";
    }
}
