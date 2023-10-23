package baseball;

import camp.nextstep.edu.missionutils.Console;

import static baseball.MessageManager.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        getStartingMessage();
        while(true){
            boolean play = PlayBaseballGame.play();

            if(play){
                break;
            }
            getRestartOrEndMessage();
            String input = Console.readLine();
            try {
                InputValidator.restartEndValidateInput(input);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                break;
            }
            if (!input.equals("1")) {
                break;
            }
        }

    }
}