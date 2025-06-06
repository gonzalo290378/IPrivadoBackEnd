package com.iprivado.private_area.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivateContentDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("date")
    private LocalDate date;

    @JsonProperty("description")
    private String description;

    @JsonProperty("contentUrl")
    private String contentUrl;

    @JsonProperty("like")
    private Long like;
}
