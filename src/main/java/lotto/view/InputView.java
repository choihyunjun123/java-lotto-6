package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    public String purchasingAmount() {
        System.out.println("구입금액을 입력해 주세요");
        return Console.readLine();
    }
}
