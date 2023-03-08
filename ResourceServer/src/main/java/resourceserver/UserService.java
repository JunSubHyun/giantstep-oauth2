package resourceserver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserResponse getUser(String userName){
        User user = userRepository.findTopByUsername(userName).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));
        return new UserResponse(user);
    }

    public Long save(UserRequest userRequest){
        return userRepository.save(userRequest.toEntity()).getId();
    }

}
