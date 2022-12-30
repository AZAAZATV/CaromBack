package AZAAZTV1.azaaztv1.dto.response;

import AZAAZTV1.azaaztv1.entitiy.ApplyEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyResponse {
    private String NAME;
    private String CLASS;

    public ApplyResponse(ApplyEntity applyentity){
        this.NAME=applyentity.getNAME();
        this.CLASS=applyentity.getCLASS();
    }

    @Override
    public String toString(){
        return "ApplyDto{"+
                "NAME='"+ NAME +'\''+
                "CLASS='"+CLASS+'\''+
                '}';
    }
}
