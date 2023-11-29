package racingcar.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import racingcar.domain.CarName;
import racingcar.domain.Forward;
import racingcar.domain.TryCount;
import racingcar.domain.Winner;
import racingcar.view.InputView;
import camp.nextstep.edu.missionutils.Console;
import racingcar.view.OutputView;

public class RacingCarController {
    CarName carName = new CarName();
    TryCount tryCount = new TryCount();
    Forward forward = new Forward();

    public void start() {
        List<String> carNames = startCarName();
        int tryCount = startTryCount();
        Map<String, Integer> raceMap = startRace(carNames, tryCount);
        startWinner(carNames, raceMap);
    }

    private List<String> startCarName() {
        InputView.readCarNames();
        String userInput = Console.readLine();
        return carName.getCarNames(userInput);
    }

    private int startTryCount() {
        InputView.readTryCount();
        String userInput = Console.readLine();
        return tryCount.getTryCount(userInput);
    }

    private void calculateForward(List<String> carNames, Map<String, Integer> raceMap) {
        for (String carName : carNames) {
            int randomNumber = forward.getRandomNumber();
            if (forward.isForward(randomNumber)) {
                raceMap.put(carName, raceMap.get(carName) + 1);
            }
            OutputView.showRacingResult(carName, raceMap.get(carName));
        }
    }

    private Map<String, Integer> startRace(List<String> carNames, int tryCount) {
        OutputView.showRacingStart();
        Map<String, Integer> raceMap = carNames.stream()
                .collect(Collectors.toMap(carName -> carName, carName -> 0));

        for (int i = 0; i < tryCount; i++) {
            calculateForward(carNames, raceMap);
            System.out.println();
        }

        return raceMap;
    }

    private void startWinner(List<String> carNames, Map<String, Integer> raceMap) {
        List<String> winners = Winner.saveWinner(carNames, raceMap);
        OutputView.showWinner(winners);
    }
}
