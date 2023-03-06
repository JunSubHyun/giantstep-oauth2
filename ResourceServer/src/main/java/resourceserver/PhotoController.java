package resourceserver;

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
public class PhotoController {

    @GetMapping("/photos")
    public Photo photos(JwtAuthenticationToken authenticationToken){
        String userName = authenticationToken.getToken().getClaims().get("sub").toString();
        System.out.println("username = "+userName);
        Photo photo1 = PhotoService.getBuild("1 ", "Photo1 title ", "Photo is nice ", "user1 ");
//        Photo photo2 = PhotoService.getBuild("2 ", "Photo2 title ", "Photo is beautiful ", "user2 ");

        return photo1;
    }


    @GetMapping("/tokenExpire")
    public Map<String, Object> tokenExpire(){
        Map<String, Object> result = new HashMap<>();
        result.put("error",new OAuth2Error("invalid token", "token is expired", null));
        System.out.println("what:::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+result.toString());

        return result;
    }
}