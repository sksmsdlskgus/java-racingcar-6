package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class PlayerinputView {
    public static String[] getNames() {
        System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분) ");
        String inputcarname = Console.readLine();
        String[] names = inputcarname.split(",");
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]); // 자동차이름 입력값 사용자 확인 출력
            if (i < names.length - 1) {
                System.out.print(",");
            }
        }
        return names;
    }


    public static int getRound() {
        System.out.print("\n시도할 회수는 몇회인가요? ");
        String inputround = Console.readLine();
        int round = Integer.parseInt(inputround);
        return round;
    }
}
