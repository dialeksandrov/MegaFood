package kg.aleksandrov.megafood.models.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sum;

    @CreationTimestamp
    private Date addDate;

    private Date editDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pins")
    private Pin pins;

    private Boolean isActive;

    private Long debt_sum;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OperationDetail> operationDetails;
}
