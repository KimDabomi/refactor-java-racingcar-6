package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Forward {
    private static final int FORWARD_CONDITION = 4;

    public boolean isForward(int randomNumber) {
        return randomNumber >= FORWARD_CONDITION;
    }

    public int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
