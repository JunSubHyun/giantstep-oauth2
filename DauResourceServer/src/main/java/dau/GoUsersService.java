package dau;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoUsersService {

    private final GoUserRepository goUserRepository;

    public GoUsersResponse getUserByLoginId(String loginId){
        GoUsers goUsersByLoginId = goUserRepository.findGoUsersByLoginId(loginId);
        return new GoUsersResponse(goUsersByLoginId);
    }

}
