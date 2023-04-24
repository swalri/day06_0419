package array_;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String [] id = new String[5];
		String [] pwd = new String[5];
		String inputId = null, InputPwd = null;
		int num, index=0, count=0;
		boolean bool = true;
		
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			num = scan.nextInt();//메뉴입력
			
			switch(num) {
			case 1:
				System.out.print("아이디 입력 : ");
				inputId = scan.next();
				System.out.print("비밀번호 입력 : ");
				InputPwd = scan.next();
				for(int i = 0;i<id.length;i++) {
					if(inputId.equals(id[i])) {
						if(InputPwd.equals(pwd[i])) {
							System.out.println("인증 통과");
						}else {
							System.out.println("비밀번호가 틀렸습니다");
						}
//						bool = false;
						break;
					}
				}
				if(index == id.length) System.out.println("없는 아이디 입니다");
//				if(bool) System.out.println("없는 아이디 입니다");
				break;
			case 2:
				System.out.println("회원가입");
				inputId = scan.next();
				InputPwd = scan.next();
//				for(index=0;index<id.length;index++) {
//					if(inputId.equals(id[index])) {
//						System.out.println("중복된 아이디 입니다");
//						break;
//					}
//					if(id[index]==null) {
//						id[index] = inputId;
//						pwd[index] = InputPwd;
//						System.out.println("가입성공");
//						break;
//					}
//				}
//				if(index == id.length) {
//					System.out.println("저장공간이 없다");
//				}
				//
				if(count <id.length) {
					for(index=0;index<count;index++) {
						if(inputId.equals(id[index])) {
							System.out.println("중복된 아이디 입니다");
							break;
						}
					}
					if(index==count) {
						id[count] = inputId;
						pwd[count] = InputPwd;
						count++;
					}
				}else {
					System.out.println("저장공간 부족");
				}
				System.out.println("회원가입");
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(1);//프로그램 강제종료
			default:
				break;
			}
			
			
			
		}
	}

}


