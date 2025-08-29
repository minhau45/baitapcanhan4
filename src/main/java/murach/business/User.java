package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String hear;
    private String news;
    private String emailNews;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        hear = "";
        news = "";
        emailNews = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, 
                String dob, String hear, String news, 
                String emailNews, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.hear = hear;
        this.news = news;
        this.emailNews = emailNews;
        this.contact = contact;
    }

    // Getter & Setter
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getHear() { return hear; }
    public void setHear(String hear) { this.hear = hear; }

    public String getNews() { return news; }
    public void setNews(String news) { this.news = news; }

    public String getEmailNews() { return emailNews; }
    public void setEmailNews(String emailNews) { this.emailNews = emailNews; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
