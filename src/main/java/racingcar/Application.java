package racingcar;

public class Application {
<<<<<<< Updated upstream
    public static void main(String[] args) {
        // TODO 구현 진행
=======
    public void main(String[] args) {
    	Vector<Car> cars = makeCarVector();
    	int trial = getTrialTime();

    	cars = startGame(cars, trial);
    	showGameResult(cars);
    }

    public Vector<Car> makeCarVector() {
    	String names[];
    	try {
    		names = inputNames();
    	}
    	catch () {

    	}

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

    public Vector<Car> startGame(Vector<Car> cars, int t) {
    	System.out.println("실행 결과");

    	for (int i=0;i<t;i++) {
    		cars = race(cars);
    	}

    	return cars;
    }

    public Vector<Car> race(Vector<Car> cars) {
    	for (int i=0;i<cars.size();i++) {
    		cars.elementAt(i).isMoved();
    	}

    	return cars;
    }

    public void showGameResult(Vector<Car> cars) {
    	String winners = "";
    	int bestscore = returnBestScore(cars);

    	for (int i=0;i<cars.size();i++) {
    		if(bestscore == cars.elementAt(i).returnPosition()) {
    			winners += cars.elementAt(i).returnName();
    			winners += ", ";
    		}
    	}
    	winners = winners.substring(0, winners.length()-2);

    	System.out.println("최종 우승자 : ");
    	System.out.println(winners);

    }

    public int returnBestScore(Vector<Car> cars) {
    	int bestscore = 0;
    	for (int i=0;i<cars.size();i++) {
    		int current = cars.elementAt(i).returnPosition();
    		if (current > bestscore) {
    			bestscore = current;
    		}
    	}

    	return bestscore;
>>>>>>> Stashed changes
    }
}
