package telran.java47.student.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundEception extends RuntimeException {

	private static final long serialVersionUID = -8637973286064563992L;

}
