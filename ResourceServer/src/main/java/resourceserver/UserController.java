package resourceserver;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/userDetail")
    public UserResponse getUserDetail(JwtAuthenticationToken authenticationToken){
        String userName = authenticationToken.getToken().getClaims().get("sub").toString();
        UserResponse user = userService.getUser(userName);

        return user;
    }
}
