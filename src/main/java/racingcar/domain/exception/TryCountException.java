package racingcar.domain.exception;

import java.util.Optional;

public class TryCountException extends IllegalArgumentException {
    private static final String NUMBER_TYPE = "[+-]?\\d*(\\.\\d+)?";
    private static final int TRY_COUNT_MIN = 1;

    public TryCountException(String errorMessage) {
        super(errorMessage);
    }

    public static void checkTryCountType(String userTryCount) {
        Optional.ofNullable(userTryCount)
                .filter(q -> q.matches(NUMBER_TYPE))
                .orElseThrow(() -> new TryCountException(ErrorMessage.TRY_COUNT_TYPE_ERROR_MESSAGE.getErrorMessage()));
    }

    public static void checkTryCountRange(int tryCount) {
        if (tryCount < TRY_COUNT_MIN) {
            throw new TryCountException(ErrorMessage.TRY_COUNT_RANGE_ERROR_MESSAGE.getErrorMessage());
        }
    }
}
