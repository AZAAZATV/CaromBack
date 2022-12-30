package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.ApplyDto;
import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import AZAAZTV1.azaaztv1.entitiy.Applyentity2;

public interface ApplyService2 {

    ApplyDto saveapply(String NAME, String CLASS); //db에 저장함. 신청한 사람의 목록을.


    Applyentity2 getApply(String NAME);
}
