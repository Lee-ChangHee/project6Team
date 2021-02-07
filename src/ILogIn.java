
public interface ILogIn {
	boolean Login(String id, String password);
	MemberVO findMyPage(String id);
	
}
