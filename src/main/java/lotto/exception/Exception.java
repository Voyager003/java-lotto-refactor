package lotto.exception;

public class Exception {

    public static int readAmountvalidate(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException("아무 것도 입력되지 않았습니다. 게임을 종료합니다.");
        }
        if (isDivide(input) || isNumber(input)) {
            throw new IllegalArgumentException("조건에 맞지 않는 값입니다. 게임을 종료합니다.");
        }
        return Integer.parseInt(input);
    }

    private static boolean isEmpty(String input) {
        if (input.equals("")) {
            return true;
        }
        return false;
    }

    private static boolean isNumber(String input) {
        if (input.matches("^[a-zA-Z]*$")) {
            return true;
        }
        return false;
    }

    private static boolean isDivide(String input) {
        int converting = Integer.parseInt(input);
        if (converting % 1000 != 0) {
            return true;
        }
        return false;
    }
}
