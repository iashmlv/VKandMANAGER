package ru.netology.domain;

public class Post {


    private long postId;
    private long postAuthorId;
    private long postDateId;
    private String postHeader;
    private String postText;
    private MediaContent mediaContent;

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getPostAuthorId() {
        return postAuthorId;
    }

    public void setPostAuthorId(long postAuthorId) {
        this.postAuthorId = postAuthorId;
    }

    public long getPostDateId() {
        return postDateId;
    }

    public void setPostDateId(long postDateId) {
        this.postDateId = postDateId;
    }

    public String getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(String postHeader) {
        this.postHeader = postHeader;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public MediaContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.mediaContent = mediaContent;
    }

}
