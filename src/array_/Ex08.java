package array_;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] id = new String[5];
		String [] pwd = new String[5];
		String inputId = null, InputPwd = null;
		int num, index=0, count=0;
		boolean login = true, tf, hi = true;
		boolean []membership = new boolean[5];
		for(int i=0;i<membership.length;i++) membership[i] = false;//membership에 false넣기
		//전체 실행
		while(true) {
			//기본 기능
			System.out.println("==================");//칸나누기
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.특정회원 보기");
			System.out.println("4.특정회원 비밀번호 수정");
			System.out.println("5.특정회원 삭제");
			System.out.println("6.모든 회원 보기");
			System.out.println("7.나가기");
			System.out.print(">>> ");
			num = scan.nextInt();
			//실행
			switch(num) {
			case 1://로그인
				System.out.println("==================");//칸나누기
				if(index ==0) {//등록되있는 회원이 없을경우
					System.out.println("회원가입 해주세요");
				}else {
					//아이디 비번 입력
					System.out.println("아이디를 입력해주세요");
					System.out.print(">>> ");
					inputId = scan.next();//아이디 입력
					System.out.println("비밀번호를 입력해주세요");
					System.out.print(">>> ");
					InputPwd = scan.next();//비번 입력
					
					for(int i=0;i<count;i++) {
						if(inputId.equals(id[i])) {
							if(InputPwd.equals(pwd[i])) {//pwd가 맞을경우
								System.out.println("로그인 성공");
								System.out.println(id[i]+"님 어서오세요");//완료시 마지막문장
							}else {
								System.out.println("비밀번호가 틀렸습니다");//완료시 마지막문장
							}//pwd가 틀릴경우
							login = false;
							break;
						}//id가 있을경우
						login = true;
					}//for
					if(login) {
						System.out.println("없는 아이디 입니다");//완료시 마지막문장
					}//id가 없을경우
				}//if else
				break;
			case 2://회원가입
				System.out.println("==================");//칸나누기
				if(index>=5) {
					System.out.println("저장할 공간이 없습니다");//완료시 마지막문장
				}//저장실패
				else {
					tf = true;//회원가입 반복문 초기값
					System.out.println("회원가입을 실행합니다");
					while(tf) {
						System.out.println("아이디를 입력해주세요");
						System.out.print(">>> ");
						inputId = scan.next();//회원가입 아이디 입력
						int i=0;//회원가입용 i
						for(i=0;i<count;i++) {//중복확인f
							
							if(inputId.equals(id[i])) {//중복일경우
								System.out.println("동일한 아이디가 있습니다");
								break;
							}//if
						}//for
						if(i==count) {
							System.out.println("비밀번호를 입력해주세요");
							System.out.print(">>> ");
							InputPwd = scan.next();//회원가입 비번 입력
							for(int j=0;j<count;j++) {
								if(membership[j] == false) {
									id[j] = inputId;//id추가
									pwd[j] = InputPwd;//pwd추가
									membership[j] = true;//membership에 false넣기
									index++;
									hi = false;
									break;
								}
							}
							if(hi) {
								id[count] = inputId;//id추가
								pwd[count] = InputPwd;//pwd추가
								membership[count] = true;
								count++;//배열 증가
								index = count;//배열에 등록한 크기
							}
							System.out.println("가입을 축하합니다");//완료시 마지막문장
							tf = false;//while
							hi = true;
						}
					}//while
				}//저장성공
				break;
			case 3://특정회원 보기
				System.out.println("==================");//칸나누기
				if(index ==0) {//등록되있는 회원이 없을경우
					System.out.println("등록되어있는 회원이 없습니다");
				}else {
					System.out.println("아이디를 입력해주세요");
					System.out.print(">>> ");
					inputId = scan.next();//아이디 입력
					for(int i=0;i<count;i++) {
						if(inputId.equals(id[i])) {
							System.out.println("id : "+id[i]);
							System.out.println("pwd : "+pwd[i]);//완료시 마지막문장
							login = false;
							break;
						}//id가 있을경우
						login = true;
					}//for
					if(login) {
						System.out.println("없는 아이디 입니다");//완료시 마지막문장
					}//id가 없을경우
				}
				break;
			case 4://특정회원 비밀번호 수정
				System.out.println("==================");//칸나누기
				if(index ==0) {//등록되있는 회원이 없을경우
					System.out.println("등록되어있는 회원이 없습니다");
				}else {
					System.out.println("아이디를 입력해주세요");
					System.out.print(">>> ");
					inputId = scan.next();//아이디 입력
					for(int i=0;i<count;i++) {
						if(inputId.equals(id[i])) {
							System.out.println("비밀번호를 입력해주세요");
							System.out.print(">>> ");
							InputPwd = scan.next();//수정할 비번 입력
							pwd[i] = InputPwd;
							System.out.println("비밀번호가 수정되었습니다");
							login = false;
							break;
						}//id가 있을경우
						login = true;
					}//for
					if(login) {
						System.out.println("없는 아이디 입니다");//완료시 마지막문장
					}//id가 없을경우
				}
				break;
			case 5://특정회원 삭제
				System.out.println("==================");//칸나누기
				if(index ==0) {//등록되있는 회원이 없을경우
					System.out.println("등록되어있는 회원이 없습니다");
				}else {
					System.out.println("아이디를 입력해주세요");
					System.out.print(">>> ");
					inputId = scan.next();//아이디 입력
					for(int i=0;i<count;i++) {
						if(inputId.equals(id[i])) {
							System.out.println("비밀번호를 입력해주세요");
							System.out.print(">>> ");
							InputPwd = scan.next();//비밀번호 입력
							if(InputPwd.equals(pwd[i])) {
								id[i] = null;
								pwd[i] = null;
								membership[i] = false;
								System.out.println("회원이 삭제되었습니다");
							}else {
								System.out.println("비밀번호가 틀렸습니다 처음부터 다시 입력해주세요");
							}
//							count--;
//							index = count;
							login = false;
							break;
						}//id가 있을경우
						login = true;
					}//for
					if(login) {
						System.out.println("없는 아이디 입니다");//완료시 마지막문장
					}//id가 없을경우
				}
				index--;
				break;
			case 6://모든 회원 보기
				System.out.println("==================");//칸나누기
				if(index ==0) {//등록되있는 회원이 없을경우
					System.out.println("등록되어있는 회원이 없습니다");
				}else {
					System.out.println("모든 회원의 아이디와 비번입니다");
					for(int i=0;i<count;i++) {
						if(id[i] != null){
							System.out.println("id : "+id[i]+" pwd : "+pwd[i]);
						}						
					}//for
				}
				break;
			case 7://나가기
				System.out.println("종료합니다");
				System.exit(1);//프로그램 강제종료
				break;
			default:
				break;
			}//switch
		}//while
	}//main
}//class