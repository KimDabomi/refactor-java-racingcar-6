package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Winner {
    public static List<String> saveWinner(List<String> carNames, Map<String, Integer> raceMap) {
        List<String> winners = new ArrayList<>();
        int maxDistance = Collections.max(raceMap.values());

        for (String carName : carNames) {
            if (raceMap.get(carName) == maxDistance) {
                winners.add(carName);
            }
        }

        return winners;
    }
}
