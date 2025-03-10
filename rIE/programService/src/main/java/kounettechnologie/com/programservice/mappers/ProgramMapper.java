package kounettechnologie.com.programservice.mappers;

import kounettechnologie.com.programservice.dto.ProgramDTO;
import kounettechnologie.com.programservice.entity.Program;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProgramMapper {
    @Autowired
    private ModelMapper modelMapper;

    public ProgramDTO toDTO(Program program) {
           return modelMapper.map(program, ProgramDTO.class);
       }



}
