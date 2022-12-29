package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.request.LoginRequest;
import AZAAZTV1.azaaztv1.dto.request.SignUpRequest;
import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import AZAAZTV1.azaaztv1.repository.DbRepository;
import AZAAZTV1.azaaztv1.service.DbsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public boolean login(LoginRequest loginRequest) {
        DbEntity findUser = dbRepository.findById(loginRequest.getId()).orElse(null);
                //.orElseThrow(() -> new RuntimeException("오류!!!"));

        if(findUser == null){
            return false;
            //throw new RuntimeException("유저가 없어");
        }

        if(!findUser.getPassword().equals(loginRequest.getPassword())) {
            return false;
            //throw new RuntimeException("비밀번호가 틀렸어");
        }

        return true;
    }

    @Override
    public String userReturn(LoginRequest loginRequest) {
        DbEntity user = dbRepository.findById(loginRequest.getId()).orElse(null);
        String name = user.getName();
        String classNum = user.getClassNum();
        return "{\"name\" : \"" + name + "\", \"class\" : \"" + classNum + "\"}";
    }
}
