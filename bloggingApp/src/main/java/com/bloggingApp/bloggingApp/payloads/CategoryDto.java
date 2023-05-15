package com.bloggingApp.bloggingApp.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;

    @NotEmpty
    @Size(min = 4)
    private String categoryTitle;

    @NotEmpty
    @Size(max = 15)
    private String CategoryDescription;
}
