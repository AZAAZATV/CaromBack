package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.request.SignUpRequest;
import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import AZAAZTV1.azaaztv1.service.DbsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DbServiceImpl implements DbsService {
    private final DbRepository dbRepository;

    @Override
    public SignUpRequest saveInfo(String ID, int PASSWORD, String NAME, String CLASS){
        SignUpRequest signUpRequest = new SignUpRequest(DbEntity.builder().build());
        return signUpRequest;
    }

    @Override
    public void signUp(SignUpRequest signUpRequest) {
        DbEntity dbentity = DbEntity.builder()
                .id(signUpRequest.getId())
                .classNum(signUpRequest.getClassNum())
                .name(signUpRequest.getName())
                .password(signUpRequest.getPassword())
                .build();

        dbRepository.save(dbentity);
    }

}
