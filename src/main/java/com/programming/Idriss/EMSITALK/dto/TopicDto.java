package com.programming.Idriss.EMSITALK.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopicDto {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private Integer numberOfPosts;
}
