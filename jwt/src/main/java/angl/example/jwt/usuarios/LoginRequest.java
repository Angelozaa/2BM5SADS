package angl.example.jwt.usuarios;

public class LoginRequest {
    private String login;
    private String password;

    // getters e setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
