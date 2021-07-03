package kg.aleksandrov.megafood.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "buffet")
public class Buffet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pictureUrl;

    private Long price;

    private Boolean isActive;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OperationDetail> operationDetails;
}
