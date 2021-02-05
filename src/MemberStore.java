import java.util.HashMap;
import java.util.Map;

public class MemberStore implements IMemberStore{
	
	static Map<String, MemberVO> store = new HashMap<>();
	// store�� ����� �� key�� MemberId
	public void save(MemberVO member) {
		store.put(member.getId(),member);
	}
	
	public MemberVO showMyPage(String memberId) {
		return store.get(memberId);
	}
}
