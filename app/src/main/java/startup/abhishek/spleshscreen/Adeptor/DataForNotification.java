package startup.abhishek.spleshscreen.Adeptor;

public class DataForNotification {
    private String notiImage;
    private String notification;
    private String time;
    private String intent;
    private String userProfile;


    public DataForNotification(String  notiImage, String notification,String intent, String time) {
        this.notiImage = notiImage;
        this.notification = notification;
        this.time = time;
        this.intent=intent;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getNotiImage() {
        return notiImage;
    }

    public void setNotiImage(String  notiImage) {
        this.notiImage = notiImage;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
