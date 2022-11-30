package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumberGenerator {

    private final List<Lotto> lottonum = new ArrayList<>();
    private final int lottocnt;

    public LottoNumberGenerator(int amount) {
        lottocnt = amount / 1000;
    }

    public List<Lotto> generateLotto() {
        for (int i = 0; i < lottocnt; i++) {
            Lotto result = generateLottonumber();
            lottonum.add(result);
        }
        return lottonum;
    }

    private Lotto generateLottonumber() {
        List<Integer> randomNum = new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        Collections.sort(randomNum);
        return new Lotto(randomNum);
    }

    public int getLottocnt() {
        return lottocnt;
    }
}
