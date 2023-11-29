package racingcar.domain;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CarNameTest {
    private static Stream<Arguments> provideCarNameTestData() {
        return Stream.of(
                Arguments.of("kimdabomi"),
                Arguments.of("KDBM"),
                Arguments.of("kim12")
        );
    }

    @ParameterizedTest(name = "{index} - 입력값 : {0}")
    @MethodSource("provideCarNameTestData")
    @DisplayName("자동차 이름 예외 확인")
    void testCarName(String userCarName) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> CarName.saveCarName(userCarName))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
}
