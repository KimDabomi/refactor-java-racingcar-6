package racingcar.domain.exception;

public class CarNameException extends IllegalArgumentException {
    private static final String TYPE_AND_SIZE = "^[a-z]{1,5}$";

    public CarNameException(String errorMessage) {
        super(errorMessage);
    }

    public static void checkCarNameTypeAndSize(String userCarName) {
        if (!userCarName.matches(TYPE_AND_SIZE)) {
            throw new CarNameException(ErrorMessage.CAR_NAME_ERROR_MESSAGE.getErrorMessage());
        }
    }
}
