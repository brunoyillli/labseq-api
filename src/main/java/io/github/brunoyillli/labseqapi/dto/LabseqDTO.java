package io.github.brunoyillli.labseqapi.dto;

import java.math.BigInteger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@ApiModel(description = "DTO for Labseq sequence value return")
public class LabseqDTO {
	
    @ApiModelProperty(notes = "Sequence value")
	private BigInteger value;
}
