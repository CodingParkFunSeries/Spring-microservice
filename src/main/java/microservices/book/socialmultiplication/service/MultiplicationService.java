package microservices.book.socialmultiplication.service;

import microservices.book.socialmultiplication.domain.Multiplication;
import microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;
import org.springframework.stereotype.Component;

public interface MultiplicationService {

    /**
     * Create a Multiplication object with two randomly generated values
     * between 11 and 99.
     *
     * @return Multiplication object with random factors.
     */
    Multiplication createRandomMultiplicaton();

    boolean checkAttempt(final MultiplicationResultAttempt attempt);

}
