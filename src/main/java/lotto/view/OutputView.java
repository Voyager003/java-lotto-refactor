package lotto.view;

import lotto.domain.LottoNumberGenerator;
import lotto.domain.Lottos;

public class OutputView {

    // 로또 구매 수량 출력
    public void printPurchaselotto(LottoNumberGenerator lottoNumberGenerator) {
        System.out.printf("%d개를 구매했습니다.\n", lottoNumberGenerator.getLottocnt());
    }

    // 로또 번호 출력
    public void printLottonumber(Lottos lottos) {
        lottos.getLottos().stream()
                .forEach(lotto -> System.out.println(lotto.getLottonumber().toString()));
    }
    // 당첨 내역 출력

    // 수익률 출력
}
