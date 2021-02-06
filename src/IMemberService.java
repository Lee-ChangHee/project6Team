public interface IMemberService {
    void join(MemberVO memberVO);
    MemberVO findMember(String memberId);
}
