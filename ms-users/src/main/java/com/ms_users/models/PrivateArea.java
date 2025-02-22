package com.ms_users.models;

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
public class PrivateArea {

    private Long id;

    private Boolean isEnabled;

    private BigDecimal monthCostPrivateArea;

    private List<PrivateContent> privateContent;

}
