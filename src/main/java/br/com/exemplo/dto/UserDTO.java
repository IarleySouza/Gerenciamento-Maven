package br.com.exemplo.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private int id;
    private String name;
    private LocalDate dataNascimento;
}
