import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MemberService memberService = new MemberService();
        MemberStore memberStore = new MemberStore(); // 硫ㅻ쾭媛� 硫붾え由� ���옣
        
        SignUp signUp = new SignUp();
        Menu returnMenu = new Menu();

        // Menu
        int menu = returnMenu.menu();

        switch (menu){
            case 1: // Login
                System.out.printf("id : ");
                String id = sc.next();
                System.out.printf("pw : ");
                String pw = sc.next();
                
                if(true) {
                	//Login True 
                	
                }else if(false) {
                	// Login False
                }
                break;
            case 2: // signUp import
            	MemberVO memberVO = signUp.signUp();
            	memberStore.save(memberVO);
            	System.out.println(memberVO.toString());
                break;
            case 3:
            	System.out.println("종료 합니다");
            	return;
                
        }
    }
}
