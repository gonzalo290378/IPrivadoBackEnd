package com.iprivado.private_area.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivateAreaDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("isEnabled")
    private Boolean isEnabled;

    @JsonProperty("monthCostPrivateArea")
    private BigDecimal monthCostPrivateArea;

    @JsonProperty("privateContentDTO")
    private List<PrivateContentDTO> privateContentDTO;

}
