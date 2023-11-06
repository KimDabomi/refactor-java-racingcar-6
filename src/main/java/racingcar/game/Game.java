package racingcar.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.race.Car;
import racingcar.race.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Game {
    static InputView inputView = new InputView();
    public static void start() {
        String[] carNames = getStrings();
        int tryCount = inputView.getTryCount();

        List<Car> cars = Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList());

        playRace(cars, tryCount);
    }

    private static String[] getStrings() {
        List<String> carNamesList = Collections.singletonList(inputView.getCarNameInput());
        String carNamesInput = String.join(",", carNamesList);
        return carNamesInput.split(",");
    }

    private static void playRace(List<Car> cars, int tryCount) {
        Race race = new Race(cars, tryCount);
        race.startRace();
        OutputView.printWinners(race.getWinners());
    }
}
