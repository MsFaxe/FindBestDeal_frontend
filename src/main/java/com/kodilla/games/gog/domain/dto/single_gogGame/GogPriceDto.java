package com.kodilla.games.gog.domain.dto.single_gogGame;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GogPriceDto {
    @JsonProperty("isDiscounted")
    private String isDiscounted;
    @JsonProperty("isFree")
    private String isFree;
    @JsonProperty("finalAmount")
    private String finalAmount;
}