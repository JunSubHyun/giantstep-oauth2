package dau;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GoUsersController {

    private final GoUsersService goUsersService;


    @GetMapping("/searchLoginId")
    public GoUsersResponse goUsersByLoginId(String loginId){
        GoUsersResponse userByLoginId = goUsersService.getUserByLoginId(loginId);
        return userByLoginId;
    }
}
