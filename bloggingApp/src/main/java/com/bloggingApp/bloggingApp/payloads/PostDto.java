package com.bloggingApp.bloggingApp.payloads;

import com.bloggingApp.bloggingApp.entities.Category;
import com.bloggingApp.bloggingApp.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

    private Integer postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
}
