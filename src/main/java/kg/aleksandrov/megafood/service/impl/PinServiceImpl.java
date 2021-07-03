package kg.aleksandrov.megafood.service.impl;

import kg.aleksandrov.megafood.dao.PinRepo;
import kg.aleksandrov.megafood.mappers.PinMapper;
import kg.aleksandrov.megafood.models.dto.PinDto;
import kg.aleksandrov.megafood.models.entity.Pin;
import kg.aleksandrov.megafood.service.PinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinServiceImpl implements PinService {

    @Autowired
    private PinRepo pinRepo;
    private PinMapper pinMapper = PinMapper.INSTANCE;

    @Override
    public PinDto savePin(PinDto pinDto) {
        boolean notUnique = pinRepo.existsByPin(pinDto.getPin());
        while (notUnique){
            int incrementedPin =Integer.valueOf(pinDto.getPin())+1;
            pinDto.setPin(String.valueOf(incrementedPin));
            notUnique = pinRepo.existsByPin(String.valueOf(incrementedPin));
        }
        Pin pin = pinRepo.save(pinMapper.toPin(pinDto));
        return pinMapper.toPinDto(pin);

    }

//    @Override
//    public void savePin(PinDto pinDto) {
//    Pin pin = pinMapper.toPin(pinDto);
//    if(pinRepo.existsByPin(pinDto.getPin())){
//        int pin1 = Integer.valueOf(pinDto.getPin());
//        pin1 += 1;
//        String pin2 = String.valueOf(pin1);
//
//    }else
//        pin = pinRepo.save(pin);
//    }


}
