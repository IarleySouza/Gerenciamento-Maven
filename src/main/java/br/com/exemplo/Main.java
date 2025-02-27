package br.com.exemplo;

import br.com.exemplo.dto.UserDTO;
import br.com.exemplo.mapper.UserMapper;
import br.com.exemplo.model.UserModel;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {

        var model = new UserModel();
        model.setCode(1);
        model.setDataNascimento(LocalDate.now());
        model.setUserName("Maria");
        System.out.println(mapper.toDTO(model));


        UserDTO dto = new UserDTO();
        dto.setId(2);
        dto.setName("Iarley");
        dto.setDataNascimento(LocalDate.now().minusYears(30));
        System.out.println(mapper.toModel(dto));
    }
}
