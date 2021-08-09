package ch07_2_polymorphism;

public class Test_07 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=0; i<5; i++) {
			if(i%3==0)
				continue;
			sum += i;
		}
		System.out.println(sum);
	}
}


	
