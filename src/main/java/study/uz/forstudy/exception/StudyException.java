package study.uz.forstudy.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class StudyException extends RuntimeException{

    private final HttpStatus responseErrorMessage;

    public StudyException(HttpStatus responseErrorMessage) {
        super(responseErrorMessage.toString());
        this.responseErrorMessage = responseErrorMessage;
    }

    public StudyException( String errMessage, HttpStatus responseErrorMessage) {
        super(responseErrorMessage.toString());
        this.responseErrorMessage = responseErrorMessage;
    }
}
