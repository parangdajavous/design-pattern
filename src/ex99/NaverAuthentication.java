package ex99;

public class NaverAuthentication extends Authentication {
    @Override
    public UserProfile login() {
        System.out.println("네이버 로그인 완료");
        return new NaverProfileAdapter(new NaverProfile(2, "haha"));
    }
}
