package om.gov.taxoman.entity;

public class User {

    private  int id;
    private String username;
    private String password;
    private String[] roles = new String[5];


    public  User(){
        this(-1,"default", "default", new String[]{"ADMIN", "USER"});
    }

    public User(int id, String username, String password, String[] roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}
