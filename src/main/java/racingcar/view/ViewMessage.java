package racingcar.view;

public enum ViewMessage {
    ASK_CAR_NAME_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_TRY_COUNT_MESSAGE("시도할 회수는 몇회인가요?"),
    SHOW_RACING_START_MESSAGE("실행 결과"),
    SHOW_RACINT_RESULT_MESSAGE("%s : %s"),
    SHOW_WINNER_MESSAGE("최종 우승자 : %s");

    private final String viewMessage;

    ViewMessage(String viewMessage) {
        this.viewMessage = viewMessage;
    }

    public String getViewMessage() {
        return viewMessage;
    }
}
