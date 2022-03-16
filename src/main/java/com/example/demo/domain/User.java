package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Validated
@ToString
@Builder
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class User {
    @JsonProperty("id")
    private int id;

    @JsonProperty("google_id")
    private String google_id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("first_name")
    private String first_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_name")
    private String last_name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("email")
    private String email;

}