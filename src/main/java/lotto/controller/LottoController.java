package lotto.controller;

import lotto.domain.LottoNumberGenerator;
import lotto.domain.Lottos;
import lotto.domain.WinningNumber;
import lotto.view.InputView;
import lotto.view.OutputView;


public class LottoController {

    private InputView inputView;
    private OutputView outputView;

    public LottoController() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void play() {
        int amount = inputView.readAmount();
        LottoNumberGenerator lottoGenerator = new LottoNumberGenerator(amount);
        Lottos lottos = new Lottos(lottoGenerator.generateLotto());
        printLottostatus(lottoGenerator, lottos);

        WinningNumber winningNumber = new WinningNumber(inputView.readWinning(), inputView.readBonus());

        printLottoresult();
    }

    private void printLottostatus(LottoNumberGenerator lottoNumberGenerator, Lottos lottos) {
        outputView.printPurchaselotto(lottoNumberGenerator);
        outputView.printLottonumber(lottos);
    }

    private void printLottoresult() {

    }
}
