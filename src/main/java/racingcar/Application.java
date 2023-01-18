package racingcar;
import java.util.Vector;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public void main(String[] args) {
    	Vector<Car> cars = makeCarVector();
    	int trial = getTrialTime();

    }

    public Vector<Car> makeCarVector() {
    	String names[] = inputNames();

    	Vector<Car> tempVector = new Vector();
    	for (int i=0;i<names.length;i++) {
    		Car temp = new Car(names[i]);
    		tempVector.add(temp);
    	}

    	return tempVector;
    }

    public String[] inputNames() {
    	String input_names;
    	System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분) ");
    	input_names = readLine();

    	String name_array[] =input_names.split(",");
    	for (int i=0;i<name_array.length;i++) {

		}
    	return name_array;
    }

    public int getTrialTime() {
    	int times_of_trial = 0;

    	try {
    		System.out.println("시도할 회수는 몇회인가요?");
    		times_of_trial += Integer.parseInt(readLine());
    	}
    	catch (NumberFormatException error) {
    		System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
    		getTrialTime();
    	}

    	return times_of_trial;
    }
}
