package com.gestionstockbackend.gestionstockbackend.handlers;

import java.util.ArrayList;
import java.util.List;

import com.gestionstockbackend.gestionstockbackend.exception.ErrorCodes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDTO {

	private Integer httpCode;
	
	private ErrorCodes code;
	
	private String message;
	
	private List<String> errors = new ArrayList<>();
	
}
