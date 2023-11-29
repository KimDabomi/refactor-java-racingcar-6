package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.exception.CarNameException;

public class CarName {
    private static final String SPLIT_UNIT = ",";

    public List<String> getCarNames(String userCarName) {
        return saveCarName(userCarName);
    }

    public static List<String> saveCarName(String userCarName) {
        List<String> carNameList = new ArrayList<>();
        String[] carNames = splitCarName(userCarName);
        for (String carName : carNames) {
            CarNameException.checkCarNameTypeAndSize(carName);
            carNameList.add(carName.trim());
        }
        return carNameList;
    }

    private static String[] splitCarName(String userCarName) {
        return userCarName.split(SPLIT_UNIT);
    }
}
