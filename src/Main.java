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

                LoginImpl lo = new LoginImpl();
                boolean flag = lo.Login(id, pw);
                if(flag) {
                	//Login True
                            try {
                                memberStore.showMyPage(id);
                                int menuMyPage = returnMenu.menuMyPage();
                                if(menuMyPage == 1){
                                    MemberVO memberVO = signUp.chMyPage();
                                    memberStore.chMember(memberVO.getId(), memberVO.getPassword() , memberVO.getName(), memberVO.getPhoneNumber());
                                }
                            }catch (NullPointerException e){
                                System.out.println("Error - NULL");
                            }finally {
                                System.out.println("EXIT MyPage");
                            }

                }else if(flag) {
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
