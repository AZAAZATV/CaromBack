package AZAAZTV1.azaaztv1.Controller;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/apply")
public class ApplyCon {
    private final ApplyRepository applyRepository;

    @PostMapping("/applyinfo1")
    public ResponseEntity<ApplyDto> regsiter(@RequestBody ApplyDto applyDto){

        Applyentity applyentity = Applyentity.builder()
                .CLASS(applyDto.getCLASS())
                .NAME(applyDto.getNAME())
                .build();

        applyRepository.save(applyentity);
       return new ResponseEntity<>(applyDto, HttpStatus.OK);
    }

    @GetMapping("/applyinfoout1")
    public String applyoutput1(@RequestParam(value="NAME") String NAME,@RequestParam(value="CLASS") String CLASS){
        return NAME+CLASS;

    }

}

