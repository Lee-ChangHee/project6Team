import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberStore memberStore = new MemberStore();
        boolean flag =true;


        // Menu

        while (true) {
            SignUp signUp = new SignUp();
            Menu returnMenu = new Menu();
            int menu = returnMenu.menu();

            switch (menu) {
                case 1: // Login
                    System.out.printf("id : ");
                    String id = sc.next();
                    System.out.printf("pw : ");
                    String pw = sc.next();
                    try {
                       flag = memberStore.Login(id, pw, memberStore.store.get(id));
                    }catch (NullPointerException e){
                        System.out.println("No Have Id");
                        break;
                    }


                    if (flag) {
                        //Login True
                        try {

                            memberStore.showMyPage(id);
                            int menuMyPage = returnMenu.menuMyPage();
                            if (menuMyPage == 1) {
                                MemberVO memberVO = signUp.chMyPage();
                                memberStore.chMember(memberVO.getId(), memberVO.getPassword(), memberVO.getName(), memberVO.getPhoneNumber());
                            }else{
                                System.out.println("Close Project");
                                return;
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error - NULL");
                        }

                    } else if (flag) {
                        // Login False
                        System.out.println("Failed Login");
                    }
                    break;
                case 2: // signUp import
                    MemberVO memberVO = signUp.signUp();
                    memberStore.save(memberVO);
                    System.out.println(memberVO.toString());
                    break;
                case 3:
                    System.out.println("Close Program");
                    return;

            }
        }
    }
}
