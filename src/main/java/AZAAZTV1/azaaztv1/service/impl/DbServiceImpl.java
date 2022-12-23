package AZAAZTV1.azaaztv1.service.impl;

import AZAAZTV1.azaaztv1.dto.Dto;
import AZAAZTV1.azaaztv1.entitiy.Dbentity;
import AZAAZTV1.azaaztv1.service.Dbservice;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImpl implements Dbservice {

    @Override
    public Dto saveInfo(String ID, int PASSWORD, String NAME, String CLASS){

        Dto dto = new Dto(Dbentity.builder().build());
        return dto;
    }

}
