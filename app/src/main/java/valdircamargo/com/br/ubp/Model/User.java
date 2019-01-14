package valdircamargo.com.br.ubp.Model;

/**
 * Created by Valdir on 13/01/2019.
 */

public class User {
    private String email,password,name,phone;

    public User() {

    }

    public User(String email, String password, String name, String phone) {
        this.email = email;
        this.password = password;
        this.name = name;

        this.phone = phone;
    }
}
