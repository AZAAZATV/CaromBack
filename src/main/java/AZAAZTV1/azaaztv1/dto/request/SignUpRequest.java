package AZAAZTV1.azaaztv1.dto.request;

import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String id;
    private int password;
    private String name;
    private String classNum;

    public SignUpRequest(DbEntity dbentity) {
        this.id = dbentity.getId();
        this.password = dbentity.getPassword();
        this.name = dbentity.getName();
        this.classNum = dbentity.getClassNum();
    }

    @Override
    public String toString(){
        return "Dto{"+
                "ID='"+ id +'\''+
                ", PASSWORD='"+ password +'\''+
                ", NAME='"+ name +'\''+
                ", CLASS='"+ classNum +'\''+
                '}';
    }

}
