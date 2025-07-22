package ex99;

public class NaverProfileAdapter extends UserProfile {
    private NaverProfile profile;

    public NaverProfileAdapter(NaverProfile profile) {
        this.profile = profile;
    }

    @Override
    public int getId() {
        return profile.getId();
    }

    @Override
    public String getUsername() {
        return profile.getUsername();
    }
}
