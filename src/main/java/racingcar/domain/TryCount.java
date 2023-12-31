package racingcar.domain;

import racingcar.domain.exception.TryCountException;

public class TryCount {
    public int getTryCount(String userTryCount) {
        int tryCount = saveTryCount(userTryCount);
        TryCountException.checkTryCountRange(tryCount);
        return tryCount;
    }

    private int saveTryCount(String userTryCount) {
        TryCountException.checkTryCountType(userTryCount);
        return Integer.parseInt(userTryCount);
    }
}
