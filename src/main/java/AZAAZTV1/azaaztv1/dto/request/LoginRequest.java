package AZAAZTV1.azaaztv1.dto.request;

import AZAAZTV1.azaaztv1.entitiy.DbEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private String id;
    private Integer password;

    public LoginRequest(DbEntity dbentity) {
        this.id = dbentity.getId();
        this.password = dbentity.getPassword();
    }
}
