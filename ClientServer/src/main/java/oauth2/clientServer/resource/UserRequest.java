package oauth2.clientServer.resource;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRequest {

    private String username;

    private String password;

    private String name;

    private String koName;

    private String employeeNumber;

    private String authorizationToken;


    public String passwordEncoder(String password){
        if (password == null) {
            throw new IllegalArgumentException("password cannot be null");
        }
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
