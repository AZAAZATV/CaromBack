package AZAAZTV1.azaaztv1.dto;

import AZAAZTV1.azaaztv1.entitiy.Applyentity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ApplyDto {
    private String NAME;
    private String CLASS;

    public ApplyDto(Applyentity applyentity){
        this.NAME=applyentity.getNAME();
        this.CLASS=applyentity.getCLASS();

    }

    @Override
    public String toString(){
        return "ApplyDto{"+
                "NAME='"+ NAME+'\''+
                "CLASS='"+CLASS+'\''+
                '}';
    }


}
