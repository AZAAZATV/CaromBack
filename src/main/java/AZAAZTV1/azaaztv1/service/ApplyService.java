package AZAAZTV1.azaaztv1.service;

import AZAAZTV1.azaaztv1.dto.ApplyDto;

public interface ApplyService {

    ApplyDto saveapply(String NAME, String CLASS); //db에 저장함. 신청한 사람의 목록을.
}
