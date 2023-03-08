package resourceserver;

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


    public User toEntity(){
        User user = User.builder()
                .username(username)
                .password(passwordEncoder(password))
                .name(name)
                .koName(koName)
                .employeeNumber(employeeNumber)
                .build();
        return user;
    }

    public String passwordEncoder(String password){
        if (password == null) {
            throw new IllegalArgumentException("password cannot be null");
        }
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
