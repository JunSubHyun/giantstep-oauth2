package oauth2.clientServer.resource;

import lombok.Data;

@Data
public class PhotosResponse {

    private String userId;
    private String photoId;
    private String photoTitle;
    private String photoDescription;


    public PhotosResponse(String userId, String photoId, String photoTitle, String photoDescription) {
        this.userId = userId;
        this.photoId = photoId;
        this.photoTitle = photoTitle;
        this.photoDescription = photoDescription;
    }
}
