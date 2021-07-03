package kg.aleksandrov.megafood.models.dto;

import kg.aleksandrov.megafood.models.entity.OperationDetail;
import lombok.Data;

import java.util.List;

@Data
public class BuffetDto {

    private Long id;

    private String pictureUrl;

    private Long price;

    private Boolean isActive;

    private List<OperationDetail> operationDetails;
}
