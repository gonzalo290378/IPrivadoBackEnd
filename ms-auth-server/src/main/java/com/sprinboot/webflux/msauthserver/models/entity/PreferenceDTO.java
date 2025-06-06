package com.sprinboot.webflux.msauthserver.models.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreferenceDTO implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("ageFrom")
    private Long ageFrom;

    @JsonProperty("ageTo")
    private Long ageTo;

    @JsonProperty("sexPreference")
    private String sexPreference;

}