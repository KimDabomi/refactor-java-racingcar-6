package racingcar.view;

import java.util.Arrays;
import java.util.List;

public class OutputView {
    private static final int INDEX = 1;
    private static final String FORWARD_STATUS = "-";
    public static void showRacingStart() {
        System.out.println();
        System.out.println(ViewMessage.SHOW_RACING_START_MESSAGE.getViewMessage());
    }

    public static void showRacingResult(String carName, int forwardStatus) {
        System.out.printf(ViewMessage.SHOW_RACINT_RESULT_MESSAGE.getViewMessage(), carName, FORWARD_STATUS.repeat(forwardStatus));
        System.out.println();
    }

    public static void showWinner(List<String> winner) {
        String[] winners = new String[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            winners[i] = winner.get(i);
        }
        System.out.printf(ViewMessage.SHOW_WINNER_MESSAGE.getViewMessage(), convertWinner(winners));
    }

    private static String convertWinner(String[] winners) {
        return Arrays.toString(winners).substring(INDEX, Arrays.toString(winners).length() - INDEX);
    }
}
