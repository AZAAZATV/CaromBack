package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.entitiy.Applyentity2;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import AZAAZTV1.azaaztv1.repository.ApplyRepository2;
import AZAAZTV1.azaaztv1.service.ApplyService;
import AZAAZTV1.azaaztv1.service.ApplyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApplyServiceimpl2 implements ApplyService2 {

    private final ApplyRepository2 applyRepository2;

    @Override
    public ApplyDto saveapply(String NAME, String CLASS){
        ApplyDto applyDto = new ApplyDto(Applyentity.builder().build());

        return applyDto;
    }

    @Override
    public Applyentity2 getApply(String NAME) {
        Optional<Applyentity2> applyentity = applyRepository2.findByNAME(NAME);
        if (applyentity.isPresent()) {
            return applyentity.get();
        }
        else return null;
    }


}
