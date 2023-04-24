package array_;
import java.util.Scanner;
public class test_0419 {
	public static void main(String[] args) {
//		배열을 이용하여 5개의 값을 입력받고
//		for each문을 사용하여
//		입력받은 값중 홀수의 합만 출력하는 프로그램을 만드시오
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int num, sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("수를 입력");
			num = scan.nextInt();
			arr[i] = num;
		}
		for(int i:arr) {
			if(i%2!=0) sum += i;
		}
		System.out.println("입력한 값중 홀수의 합은 "+sum+"입니다");
		
	}
}


