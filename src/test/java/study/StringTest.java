package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIOException;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        String str = "1,2";
        String[] split = str.split(",");
        assertThat(split).contains("1");
    }

    @Test
    void subStringTest() {
        String str = "(1,2)";
        String result = str.substring(1, str.length()-1);
        assertThat(result).isEqualTo("1,2");
    }

    /*    @Test
    @DisplayName("특정문자 위치 확인 테스트")
    void requirement3() {
        int index = 1;
        String str = "abc";
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> str.charAt(index));
                //.withMessageContaining("%d", index);
    }*/


    @Test
    @DisplayName("Exception 테스트")
    public void charAtTest() {
        assertThatIOException().isThrownBy(() -> {throw new IOException("boom!"); })
                .withMessage("%s!", "boom")
                .withMessageContaining("boom")
                .withNoCause();
    }

}


