package study.afterfeedback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jhkim
 * @since 2022-09-03
 */
public class ValidationTest {
    private Balls balls;

    @BeforeEach
    public void setUp() {
        balls = new Balls(8,2);
    }

    @Test
    public void ballNumberValidationTest() {
        BaseBallGame baseBallGame = new BaseBallGame();
        assertThat(baseBallGame.init().getNumber()).isGreaterThanOrEqualTo(1);
        assertThat(baseBallGame.init().getNumber()).isLessThanOrEqualTo(9);
    }

    @Test
    public void ball() {
        assertThat(balls.play(new Balls(2,5))).isEqualTo(Status.BALL);
    }

    @Test
    public void strike() {
        assertThat(balls.play(new Balls(2,5))).isEqualTo(Status.STRIKE);
    }

    @Test
    public void nothing() {
        assertThat(balls.play(new Balls(2,5))).isEqualTo(Status.NOTHING);
    }
}
