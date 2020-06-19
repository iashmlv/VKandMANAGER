package ru.netology.domain;

public class CommentsInfo {
    private long count;
    private CommentsText commentsText;


    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public CommentsText getCommentsText() {
        return commentsText;
    }

    public void setCommentsText(CommentsText commentsText) {
        this.commentsText = commentsText;
    }


}
