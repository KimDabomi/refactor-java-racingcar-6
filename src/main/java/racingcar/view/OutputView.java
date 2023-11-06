package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.race.Car;

public class OutputView {
    private final List<Car> cars;

    public OutputView(List<Car> cars) {
        this.cars = cars;
    }

    public static void printRace(List<Car> cars) {
        for (Car car : cars) {
            System.out.printf("%s : %s", car.getCarName(), "-".repeat(car.getPosition()));
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinners(List<Car> winners) {
        String winnerNames = getWinnerNames(winners);
        System.out.println("최종 우승자 : " + winnerNames);
    }

    private static String getWinnerNames(List<Car> winners) {
        String winnerNames = winners.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));
        return winnerNames;
    }
}