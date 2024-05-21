package com.programming.Idriss.EMSITALK.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private Long postId;
    private String topicName;
    @NotBlank
    private String postName;
    private String url;
    private String description;
}
