package kg.aleksandrov.megafood.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {kg.aleksandrov.megafood.exceptions.Exceptions.class})
    public ResponseEntity<Object> handleRequestException(kg.aleksandrov.megafood.exceptions.Exceptions e){
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        kg.aleksandrov.megafood.exceptions.Exception exception = new kg.aleksandrov.megafood.exceptions.Exception(e.getMessage());
        return new ResponseEntity<>(exception, badRequest);
    }
}
