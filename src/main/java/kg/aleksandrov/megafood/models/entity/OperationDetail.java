package kg.aleksandrov.megafood.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "operation_details")
public class OperationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buffet_id")
    private Buffet buffetId;

    @ManyToOne
    @JoinColumn(name = "operation_id")
    private Operation operationId;


    private Long amount;
}
