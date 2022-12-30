package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.response.ApplyResponse;
import AZAAZTV1.azaaztv1.entitiy.ApplyEntity2;

public interface ApplyService2 {
    ApplyEntity2 getApply(String name);

    boolean deleteApply(ApplyResponse applyResponse);
}
