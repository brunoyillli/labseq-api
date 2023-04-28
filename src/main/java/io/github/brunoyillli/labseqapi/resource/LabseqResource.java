package io.github.brunoyillli.labseqapi.resource;

import java.math.BigInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.brunoyillli.labseqapi.dto.LabseqDTO;
import io.github.brunoyillli.labseqapi.service.LabseqService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/labseq")
public class LabseqResource {

	private LabseqService labseqService;

	public LabseqResource(LabseqService labseqService) {
		this.labseqService = labseqService;
	}

	@ApiOperation(value = "Get labseq value by index", 
			notes = "Returns the labseq value corresponding to the given index")
	@ApiResponses(value = { @ApiResponse(code = 200, response = LabseqDTO.class, message = ""), })
	@GetMapping("{n}")
	public ResponseEntity<LabseqDTO> get(
			@PathVariable(name = "n") @ApiParam(value = "Labseq value index") Integer index) {
		BigInteger labseqResult = labseqService.getLabseqValue(index);
		return new ResponseEntity<LabseqDTO>(LabseqDTO.builder().value(labseqResult).build(), HttpStatus.OK);
	}

}
