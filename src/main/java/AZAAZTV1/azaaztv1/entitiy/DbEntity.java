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
@Table(name = "signup")
public class DbEntity {
    @Id
    @Column(name ="ID",nullable = false, unique = true) //db 컬럼명 적을 것
    private String id;

    @Column(name ="PASSWORD", nullable = false)
    private int password;

    @Column(name ="NAME",nullable = false)
    private String name;

    @Column(name ="CLASS",nullable = false)
    private String classNum;



}
