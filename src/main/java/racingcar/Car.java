package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    private int returnRandomNumber() {
    	return pickNumberInRange(0,9);
    }

    public void isMoved() {
    	if (this.returnRandomNumber() >= 4) {
    		position++;
    	}
    	printPosition();
    }

    public int returnPosition() {
    	return this.position;
    }

    public String returnName() {
    	return this.name;
    }

    private void printPosition() {
    	System.out.println(this.name);
    	for (int i=0;i<position;i++) {
    		System.out.println("-");
    	}
    }

    // 추가 기능 구현
}
