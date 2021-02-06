import java.util.HashMap;
import java.util.Map;

public class MemberStore implements IMemberStore{
	
	static Map<String, MemberVO> store = new HashMap<>();
	// store
	public void save(MemberVO member) {
		store.put(member.getId(),member);
		// Id키값을 기준으로 MemberVO 정렬

	}
	
}
