package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jhkim
 * @since 2022-08-31
 */
class NumberBaseballGameTest {

    @Test
    @DisplayName("서로 다른 세자리 테스트")
    public void eachDifferentNumberTest () {
        NumberBaseballGame baseballGame = new NumberBaseballGame();
        int [] comNumArr = baseballGame.createNums();
        assertThat(comNumArr[0]).isNotEqualTo(comNumArr[1]);
        assertThat(comNumArr[0]).isNotEqualTo(comNumArr[2]);
        assertThat(comNumArr[1]).isNotEqualTo(comNumArr[2]);

    }

}