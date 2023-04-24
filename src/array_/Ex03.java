package array_;

public class Ex03 {
	public static void main(String[] args) {
//		String[] str = {"aaa","bbb","ccc"};
//		for(String s:str) {
//			System.out.println(s);
//		}
		int arr[] = {10,54,13,17,25,30};
		for(int i:arr) {
			if(i%2==0) {
				System.out.println("짝수 : "+i);
			}else {
				System.out.println("홀수 : "+i);
			}
		}
		
		
		
	}
}


