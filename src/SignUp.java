import java.util.Scanner;

public class SignUp implements ISignUp{
	Scanner sc = new Scanner(System.in);


	@Override
	public MemberVO signUp() {
		System.out.println("Sign Up\n");
		System.out.printf("NAME : ");
		String name = sc.next();
		System.out.printf("ID : ");
		String id = sc.next();
		System.out.printf("PASSWORD : ");
		String password = sc.next();
		System.out.printf("PHONENUMBER : ");
		String phoneNumber = sc.next();

		MemberVO memberVO = new MemberVO(name, password, id, phoneNumber);
		return memberVO;
	}


	public MemberVO chMyPage() {
		System.out.println("Sign Up\n");
		System.out.printf("NAME : ");
		String name = sc.next();
		System.out.printf("ID : ");
		String id = sc.next();
		System.out.printf("PASSWORD : ");
		String password = sc.next();
		System.out.printf("PHONENUMBER : ");
		String phoneNumber = sc.next();

		MemberVO memberVO = new MemberVO(name, password, id, phoneNumber);
		return memberVO;
	}
    
    

}
