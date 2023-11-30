package racingcar.domain;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TryCountTest {
    TryCount tryCount = new TryCount();
    
    private static Stream<Arguments> provideTryCountTestData() {
        return Stream.of(
                Arguments.of("a123"),
                Arguments.of("-1")
        );
    }

    @ParameterizedTest(name = "{index} - 입력값 : {0}")
    @MethodSource("provideTryCountTestData")
    @DisplayName("시도 횟수 예외 확인")
    void testCarName(String userTryCount) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> tryCount.getTryCount(userTryCount))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
}
