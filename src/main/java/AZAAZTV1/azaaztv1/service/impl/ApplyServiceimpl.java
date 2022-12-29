package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.service.ApplyService;
import org.springframework.stereotype.Service;

@Service
public class ApplyServiceimpl implements ApplyService {
    @Override
    public ApplyDto saveapply(String NAME, String CLASS){
        ApplyDto applyDto = new ApplyDto(Applyentity.builder().build());

        return applyDto;
    }
}
