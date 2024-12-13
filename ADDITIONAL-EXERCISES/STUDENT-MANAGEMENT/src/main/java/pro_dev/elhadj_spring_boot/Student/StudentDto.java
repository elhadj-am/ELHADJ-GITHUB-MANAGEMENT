package pro_dev.elhadj_spring_boot.Student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(
        @NotEmpty(message = "Firstname should not be empty")
        String firstname,

        @NotEmpty(message = "lastname should not be empty")
        String lastname,
        @NotEmpty
        String email,
        Integer schoolId) {
}
