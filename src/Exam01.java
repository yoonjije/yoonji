import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int scores[] = new int[5];
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i] = in.nextInt();
			sum = sum+scores[i];
			avg = (double)sum/5;

		}	
		System.out.println("평균 성적은 : " + avg + "입니다.");
	}

}

