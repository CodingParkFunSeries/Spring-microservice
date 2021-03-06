package microservices.book.socialmultiplication.domain;

import com.sun.org.apache.xpath.internal.operations.Mult;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class MultiplicationResultAttempt {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private final User user;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private final Multiplication multiplication;
    private final int resultAttempt;

    private final boolean correct;

    public MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
        correct = false;
    }

}
