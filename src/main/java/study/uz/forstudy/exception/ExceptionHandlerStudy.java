package study.uz.forstudy.exception;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
@AllArgsConstructor
public class ExceptionHandlerStudy extends RuntimeException {

    @ExceptionHandler
    public ResponseEntity<?>handleMbClientDataException(StudyException e) {
        log.error("Handled StudyException, message: {}", e.getResponseErrorMessage().toString());
        return new ResponseEntity<>(null, e.getResponseErrorMessage());
    }

    //    @ExceptionHandler
    public <T extends Exception> ResponseEntity<?> handleGeneralException(T e) {
        log.error("UNEXPECTED ERROR OCCURRED, error message: {}", e.getMessage());
        log.error("Error details: ", e);
        return new ResponseEntity<>(null, HttpStatus.valueOf("UNKNOWN ERROR"));
    }
}
