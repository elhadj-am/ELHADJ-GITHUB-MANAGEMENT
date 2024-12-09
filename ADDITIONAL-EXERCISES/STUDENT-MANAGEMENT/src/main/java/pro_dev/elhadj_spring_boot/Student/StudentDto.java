package pro_dev.elhadj_spring_boot.Student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty
        String firstname,
        @NotEmpty
        String lastname,
        @NotEmpty
        String email,
        Integer schoolId) {
}
