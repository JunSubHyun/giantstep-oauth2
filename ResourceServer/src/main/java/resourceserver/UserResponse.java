package resourceserver;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserResponse {

    private Long userId;
    private String username;

    private String name;

    private String koName;

    private String employeeNumber;

    public UserResponse(User user) {
        this.userId = user.getId();
        this.username = user.getUsername();
        this.name = user.getName();
        this.koName = user.getKoName();
        this.employeeNumber = user.getEmployeeNumber();
    }

}
