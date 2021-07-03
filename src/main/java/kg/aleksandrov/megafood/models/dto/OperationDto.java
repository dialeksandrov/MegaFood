package kg.aleksandrov.megafood.models.dto;

import kg.aleksandrov.megafood.models.entity.OperationDetail;
import kg.aleksandrov.megafood.models.entity.Pin;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OperationDto {

    private Long id;

    private Long sum;

    private Date addDate;

    private Date editDate;

    private Pin pins;

    private Boolean isActive;

    private Long debt_sum;

    private List<OperationDetail> operationDetails;
}
