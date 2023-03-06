package oauth2.clientServer.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import shareObject.AccessToken;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ResourceServerController {

    private final RestTemplate restTemplate;

    private String USER_URL = "http://127.0.0.1:8082";

    @GetMapping("/photos")
    public ResponseEntity<PhotosResponse> photosResponse(String authorization){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization","Bearer "+authorization);

        HttpEntity httpEntity = new HttpEntity(headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<PhotosResponse> responseData = restTemplate.exchange(USER_URL + "/photos", HttpMethod.GET, httpEntity, PhotosResponse.class);
        System.out.println("responseData  ::" + responseData);

        return responseData;
    }


}
