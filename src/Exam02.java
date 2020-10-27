import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int max = 0;
		int num1, num2;

		System.out.print("첫 번째 정수 : ");
		num1 = in.nextInt();
		System.out.print("두 번째 정수 : ");
		num2 = in.nextInt();	

		if(num1>num2) {
			max = num1;
		}

		if(num1<num2) {
			max = num2;
		}
		System.out.println("큰 수는 : " + max);


	}
}