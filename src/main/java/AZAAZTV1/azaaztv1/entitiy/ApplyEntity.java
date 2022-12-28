package AZAAZTV1.azaaztv1.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor //생성자 자동완성 안되잖앗ㅂ
@Getter
@Entity
@Table(name="apply")
public class ApplyEntity {

    @Id
    @Column(name ="NAME",nullable = false, unique = true)
    private String name;

    @Column(name ="CLASS",nullable = false)
    private String classNum;

}
