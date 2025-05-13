package br.com.fiap.gestao_transporte_corporativo.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record TransporteCadastroDto(
        Long id,

        @NotBlank(message = "O modelo do transporte é obrigatório!")
        String modelo,

        @NotBlank(message = "O tipo de combustível do transporte é obrigatório!")
        String tipoCombustivel,

        @NotBlank(message = "A capacidade de Km por litro do transporte é obrigatório!")
        @DecimalMin(value = "1.0")
        @DecimalMax(value = "50.0")
        float kmPorLitro,

        LocalDate ultimaManutencao
) {
}