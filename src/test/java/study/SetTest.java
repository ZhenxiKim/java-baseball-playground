package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.HashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jhkim
 * @since 2022-08-28
 */
public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set size 확인")
    void setSizeTest() {
        int size = numbers.size();
        assertThat(size).isEqualTo(3);
    }

    @DisplayName("set 값 존재 확인")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void containsTest(int input) {
        //중복되는 테스트 코드 ParameterizedTest
        assertThat(numbers.contains(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true","4:false","5:false"}, delimiter = ':')
    void dynamicInputValueTest(int input, boolean expected) {
        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
