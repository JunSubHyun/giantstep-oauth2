package resourceserver;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;

    private String username;
    private String password;

    private String name;

    private String koName;

    private String employeeNumber;

    @Builder
    public User(Long id, String username, String password, String name, String koName, String employeeNumber) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.koName = koName;
        this.employeeNumber = employeeNumber;
    }
}
