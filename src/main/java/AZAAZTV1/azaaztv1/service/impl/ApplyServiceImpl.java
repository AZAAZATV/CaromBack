package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.response.ApplyResponse;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;
import AZAAZTV1.azaaztv1.repository.ApplyRepository;
import AZAAZTV1.azaaztv1.service.ApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
@RequiredArgsConstructor
public class ApplyServiceImpl implements ApplyService {
    private final ApplyRepository applyRepository;

    @Override
    public ApplyEntity getApply(String name) {
        Optional<ApplyEntity> applyEntity = applyRepository.findByNAME(name);
        if (applyEntity.isPresent()) {
            return applyEntity.get();
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteApply(ApplyResponse applyResponse) {
        ApplyEntity applyEntity = applyRepository.findById(applyResponse.getNAME()).orElse(null);

        if (applyEntity != null) {
            System.out.println(applyEntity);
            applyRepository.delete(applyEntity);
            return true;
        }

        System.out.println(applyEntity);
        return false;
    }

}