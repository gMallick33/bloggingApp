package com.bloggingApp.bloggingApp.payloads;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class JwtAuthResponse {
    private String token;
}
