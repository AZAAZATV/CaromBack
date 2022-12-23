package AZAAZTV1.azaaztv1.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder //파라미터 값 쉽게 넣기
@AllArgsConstructor //생성자 자동완성
@NoArgsConstructor //생성자 자동완성 안되잖앗ㅂ
@Getter
@Entity
@Table(name = "usersave")
public class Dbentity {
    @Id
    @Column(name ="ID",nullable = false, unique = true) //db 컬럼명 적을 것
    private String ID;

    @Column(name ="PASSWORD", nullable = false)
    private int PASSWORD;

    @Column(name ="NAME",nullable = false)
    private String NAME;

    @Column(name ="CLASS",nullable = false)
    private String CLASS;



}
