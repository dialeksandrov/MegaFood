package kg.aleksandrov.megafood.mappers;

import kg.aleksandrov.megafood.models.dto.PinDto;
import kg.aleksandrov.megafood.models.entity.Pin;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PinMapper {

    PinMapper INSTANCE = Mappers.getMapper(PinMapper.class);

    Pin toPin(PinDto pinDto);

    PinDto toPinDto(Pin pin);
}
