package dau;

import lombok.Data;

@Data
public class GoUsersResponse {

    private Long userId;

    private String loginId;

    private String employeeNumber;

    private String name;

    public GoUsersResponse(GoUsers goUsers) {
        this.userId = goUsers.getUserId();
        this.loginId = goUsers.getLoginId();
        this.employeeNumber = goUsers.getEmployeeNumber();
        this.name = goUsers.getName();
    }
}
