package racingcar.view;

public class InputView {
    public static void readCarNames() {
        System.out.println(ViewMessage.ASK_CAR_NAME_MESSAGE.getViewMessage());
    }

    public static void readTryCount() {
        System.out.println(ViewMessage.ASK_TRY_COUNT_MESSAGE.getViewMessage());
    }
}
