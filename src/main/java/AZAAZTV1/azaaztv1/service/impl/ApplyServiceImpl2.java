package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.response.ApplyResponse;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity2;
import AZAAZTV1.azaaztv1.repository.ApplyRepository2;
import AZAAZTV1.azaaztv1.service.ApplyService2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Service
@RequiredArgsConstructor
public class ApplyServiceImpl2 implements ApplyService2 {
    private final ApplyRepository2 applyRepository2;

    @Override
    public ApplyEntity2 getApply(String name) {
        Optional<ApplyEntity2> applyEntity2 = applyRepository2.findByNAME(name);
        if(applyEntity2.isPresent()) {
            return applyEntity2.get();
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteApply(ApplyResponse applyResponse) {
        ApplyEntity2 applyEntity = applyRepository2.findById(applyResponse.getNAME()).orElse(null);

        if (applyEntity != null) {
            System.out.println(applyEntity);
            applyRepository2.delete(applyEntity);
            return true;
        }

        System.out.println(applyEntity);
        return false;
    }
}
