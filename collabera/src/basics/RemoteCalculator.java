package basics;

public class RemoteCalculator implements Calculator {
	public int add(int ...arr) {
		int Sum=0;
		for(int a:arr) {
			Sum=Sum+a;
		}
		return Sum;
	}
		}
		

