package io.devshare.domain;

/**
 * 이미지 포스트 도메인.
 */
public class ImagePost {

    private String uploader;
    private String url;

    private ImagePost(String uploader) {
        this.uploader = uploader;
    }

    /**
     * 업로더가 설정된 도메인 객체를 생성해 리턴합니다.
     *
     * @param uploader 업로더 이름
     * @return 업로더 이름이 설정되어 생성된 도메인 객체
     */
    public static ImagePost createImagePostFrom(String uploader) {
        return new ImagePost(uploader);
    }

    public String getUploader() {
        return uploader;
    }

    public void upload(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
