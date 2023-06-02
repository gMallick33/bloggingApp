package com.bloggingApp.bloggingApp.services;

import com.bloggingApp.bloggingApp.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);
    void deleteComment(Integer commentId);
}
