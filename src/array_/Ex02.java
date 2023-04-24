package array_;

public class Ex02 {
	public static void main(String[] args) {
		int[]arr= {111,222,333};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("============");
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("============");
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]+100;
			System.out.println(arr[i]);
		}
		System.out.println("============");
		
		int index = 0;
		for(int i:arr) {	
			arr[index] = i-100;
			System.out.println(arr[index]);
			index++;
		}
		
		
		
		
		
		
		
		
	}
}


