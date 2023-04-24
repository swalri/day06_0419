package array_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Even_Odd;
		int arr[] = {10,54,13,17,25,30};
		
		System.out.print("짝수, 홀수 입력 : ");
		Even_Odd = scan.next();
		
//		for(int i:arr) {
//			if(Even_Odd.equals("짝수") && i%2==0) 	  System.out.println(Even_Odd+" : "+i);
//			else if(Even_Odd.equals("홀수") && i%2!=0) System.out.println(Even_Odd+" : "+i);
//		}
		
		if(Even_Odd.equals("짝수")) {
			for(int i : arr) {
				if(i%2==0) System.out.println(Even_Odd+" : "+i);
			}
		}else if(Even_Odd.equals("홀수")) {
			for(int i : arr) {
				if(i%2!=0) System.out.println(Even_Odd+" : "+i);
			}
		}else System.out.println("오류");
		
		
		
		
	}
}


