package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import AZAAZTV1.azaaztv1.service.ApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApplyServiceimpl implements ApplyService {

    private final ApplyRepository applyRepository;

    @Override
    public ApplyDto saveapply(String NAME, String CLASS){
        ApplyDto applyDto = new ApplyDto(Applyentity.builder().build());

        return applyDto;
    }

    @Override
    public Applyentity getApply(String NAME) {
        Optional<Applyentity> applyentity = applyRepository.findByNAME(NAME);
        if (applyentity.isPresent()) {
            return applyentity.get();
        }
        else return null;
    }

    @Override
    public void delete(String NAME) {

    }


}
