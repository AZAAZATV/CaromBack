package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.response.ApplyResponse;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;

public interface ApplyService {
    ApplyEntity getApply(String name);

    boolean deleteApply(ApplyResponse applyResponse);
}
