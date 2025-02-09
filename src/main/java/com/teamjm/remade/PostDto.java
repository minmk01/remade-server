package com.teamjm.remade;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class PostDto {
    private CreatedDate createdDate;
    private LastModifiedDate updatedDate;
    private String post;

    public CreatedDate getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(CreatedDate createdDate) {
        this.createdDate = createdDate;
    }

    public LastModifiedDate getUpdatedDate(){
        return updatedDate;
    }

    public void setUpdatedDate(LastModifiedDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostDto = " + createdDate + "/" + post;
    }
}
