package br.com.exemplo.model;

import lombok.*;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class UserModel {
    private int code;
    private String userName;
    private LocalDate dataNascimento;
}
