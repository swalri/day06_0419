package array_;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int [] arr = new int[5];
//		System.out.println(arr[0]);
//		String[]str = new String[5];
//		System.out.println(str[0]);
//		str[0] = "aaaa";
//		if(str[1]!=null) {
//			System.out.println("값이 존재한다");
//			if(str[0].equals("aaaa")) {
//				System.out.println("aaaa와 같다");
//			}
//			else {
//				System.out.println("같지 않다");
//			}
//		}
//		else {
//			System.out.println("값이 없다");
//		}
		String [] id = new String[5];
		String [] pwd = new String[5];
		String id_S = null, pwd_S;
		int ch, id_Pwd=0;//ch 초기선택, id_Pwd 등록되있는 수, 
		boolean tf, login = true;//tf = 전체반복 tf = 회원가입반복
		
		
		while(true) {
			System.out.println("==================");//칸나누기
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			ch = scan.nextInt();//메뉴입력
			
			switch(ch) {
			case 1://로그인
				System.out.println("==================");//칸나누기
				if(id_Pwd ==0) {//등록되있는 회원이 없을경우
					System.out.println("회원가입 해주세요");
				}else {
					//아이디 비번 입력
					System.out.println("아이디를 입력해주세요");
					System.out.print(">>> ");
					id_S = scan.next();//아이디 입력
					System.out.println("비밀번호를 입력해주세요");
					System.out.print(">>> ");
					pwd_S = scan.next();//비번 입력
					
					for(int i=0;i<id_Pwd;i++) {
						if(id_S.equals(id[i])) {
							if(pwd_S.equals(pwd[i])) {//pwd가 맞을경우
								System.out.println("로그인 성공");
								System.out.println(id[i]+"님 어서오세요");//완료시 마지막문장
							}else {
								System.out.println("비밀번호가 틀렸습니다");//완료시 마지막문장
							}//pwd가 틀릴경우
							login = false;
							break;
						}//id가 있을경우
					}//for
					if(login) {
						System.out.println("없는 아이디 입니다");//완료시 마지막문장
					}//id가 없을경우
				}//if else
				break;
			case 2://회원가입
				System.out.println("==================");//칸나누기
				if(id_Pwd>=5) {
					System.out.println("저장할 공간이 없습니다");//완료시 마지막문장
				}//저장실패
				else {
					tf = true;//회원가입 반복문 초기값
					System.out.println("회원가입을 실행합니다");
					while(tf) {
						System.out.println("아이디를 입력해주세요");
						System.out.print(">>> ");
						id_S = scan.next();//회원가입 아이디 입력
						for(int i=0;i<=id_Pwd;i++) {//중복확인
							if(id_S.equals(id[i])) {//중복일경우
								System.out.println("동일한 아이디가 있습니다");
								tf = true;
								break;
							}//if
							tf = false;//while
						}//for
					}//while
					id[id_Pwd] = id_S;//id추가
					System.out.println("비밀번호를 입력해주세요");
					System.out.print(">>> ");
					pwd_S = scan.next();//회원가입 비번 입력
					pwd[id_Pwd] = pwd_S;//pwd추가
					System.out.println("가입을 축하합니다");//완료시 마지막문장
					id_Pwd++;//배열 증가
				}//저장성공
				break;
			case 3://종료
				System.out.println("종료합니다");
				System.exit(1);//프로그램 강제종료
				break;
			default://예외
				break;
			}//swhitch
		}//while
	}
}


