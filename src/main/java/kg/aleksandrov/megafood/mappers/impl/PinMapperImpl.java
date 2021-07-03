package kg.aleksandrov.megafood.mappers.impl;

import kg.aleksandrov.megafood.mappers.PinMapper;
import kg.aleksandrov.megafood.models.dto.PinDto;
import kg.aleksandrov.megafood.models.entity.Pin;

public class PinMapperImpl implements PinMapper {
    @Override
    public Pin toPin(PinDto pinDto) {
        Pin pin = new Pin();
        pin.setPin(pinDto.getPin());
        return pin;
    }

    @Override
    public PinDto toPinDto(Pin pin) {
        return null;
    }
}
