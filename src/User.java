

import java.io.Serializable;

public class User implements Serializable {
    public String username;
    public String email;
    public String year;
    public String sex;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return username + " " + email + " " + year + " " + sex;
    }
}
