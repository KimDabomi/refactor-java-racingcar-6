package racingcar.domain.exception;

public enum ErrorMessage {
    ERROR_MESSAGE_HEADER("[ERROR] "),
    CAR_NAME_ERROR_MESSAGE("자동차 이름은 5자 이하의 소문자만 가능합니다."),
    TRY_COUNT_RANGE_ERROR_MESSAGE("시도 횟수는 1이상의 수만 입력 가능 합니다."),
    TRY_COUNT_TYPE_ERROR_MESSAGE("시도 횟수는 숫자만 입력 가능합니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return ERROR_MESSAGE_HEADER.errorMessage + errorMessage;
    }
}
