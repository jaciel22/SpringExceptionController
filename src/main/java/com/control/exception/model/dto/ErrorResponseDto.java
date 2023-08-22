package com.control.exception.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponseDto {

    private String mensaje;
    private String folio;

    public ErrorResponseDto(String mensaje, String folio) {
        this.mensaje = mensaje;
        this.folio = folio;
    }

    // Getters y setters
}