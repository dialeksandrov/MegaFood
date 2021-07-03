package kg.aleksandrov.megafood.models.dto;

import kg.aleksandrov.megafood.models.entity.Buffet;
import kg.aleksandrov.megafood.models.entity.Operation;
import lombok.Data;

@Data
public class OperationDetailDto {

    private Long id;

    private Buffet buffetId;

    private Operation operationId;

    private Long amount;
}
