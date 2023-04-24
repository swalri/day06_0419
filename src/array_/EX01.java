package array_;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
배열
 - 같은 자료형으로 연속된 공간을 만드는 것
 - 자료형 배열명[] 또는 자료형 [] 배열명
 - index는 0부터 시작한다.(index는 배열의 위치)
*/
		int [] arr = new int[3];
		arr[0] = 1111;
		arr[1] = 2222;
		arr[2] = 3333;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[]arr2 = {111,222,333,444,555};
		System.out.println("arr2 length : "+arr2.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		
	}

}


