package resourceserver;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import shareObject.Photo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PhotoController {

    private final UserService userService;

    @GetMapping("/photos")
    public UserResponse photos(JwtAuthenticationToken authenticationToken){
        String userName = authenticationToken.getToken().getClaims().get("sub").toString();
        UserResponse user = userService.getUser(userName);

        return user;
    }


    @GetMapping("/tokenExpire")
    public Map<String, Object> tokenExpire(){
        Map<String, Object> result = new HashMap<>();
        result.put("error",new OAuth2Error("invalid token", "token is expired", null));
        return result;
    }
}