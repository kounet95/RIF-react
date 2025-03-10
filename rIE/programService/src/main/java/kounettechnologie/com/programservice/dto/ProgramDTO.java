package kounettechnologie.com.programservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProgramDTO {
        private String name;
        private String description;
        private String fileName;
}
