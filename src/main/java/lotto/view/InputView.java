package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.exception.Exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    // 로또 구입금액 입력
    public int readAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String amount = Console.readLine();
        return Exception.readAmountvalidate(amount);
    }

    // 당첨번호 입력
    public List<Integer> readWinning() {
        System.out.println("당첨 번호를 입력해 주세요.");
        return Arrays.stream(Console.readLine().split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    // 보너스번호 입력
    public int readBonus() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonus = Console.readLine();
        return Integer.parseInt(bonus);
    }
}
