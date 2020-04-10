package microservices.book.socialmultiplication.service;

import microservices.book.socialmultiplication.domain.Multiplication;
import microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {

    /**
     * Create a Multiplication object with two randomly generated values
     * between 11 and 99.
     *
     * @return Multiplication object with random factors.
     */
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt attempt);

    List<MultiplicationResultAttempt> getStatsForUser(String userAlias);

}
