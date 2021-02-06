public class MemberService implements IMemberService{
    @Override
    public void join(MemberVO memberVO) {
        // 유효성 검사
        memberVO.setId();
    }

    @Override
    public MemberVO findMember(String memberId) {
        return null;
    }
}
