package lotto.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WinningNumber {

    private final List<Integer> winningNumber;
    private final int bonusNumber;

    public WinningNumber(List<Integer> winningNumber, int bonusNumber) {
        validateRange(winningNumber);
        validateSize(winningNumber);
        this.winningNumber = winningNumber;
        this.bonusNumber = bonusNumber;
    }

    private void validateRange(List<Integer> winningNumber) {
        for (int number : winningNumber) {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("[ERROR] 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }

    private void validateSize(List<Integer> winningNumber) {
        Set<Integer> duplicatedNum = new HashSet<>(winningNumber);
        if(duplicatedNum.size() !=6){
            throw new IllegalArgumentException("[ERROR] 중복되지 않은 6자리 숫자를 입력해야 합니다.");
        }
    }

    public List<Integer> getWinningNumber() {
        return winningNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
