package pro_dev.elhadj_spring_boot.Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentMapperTest {
    StudentMapper studentMapper;

    @BeforeEach
    void setUp() {
        studentMapper = new StudentMapper();
    }

    @Test
    public void shouldMapStudentDtoToStudent() {
        StudentDto studentDto = new StudentDto("Travis",
                "DIALLO",
                "travis@gmail.com",
                1);
        Student student = studentMapper.toStudent(studentDto);

        Assertions.assertEquals(student.getFirstname(), studentDto.firstname());
        Assertions.assertEquals(student.getLastname(), studentDto.lastname());
        Assertions.assertEquals(student.getEmail(), studentDto.email());
        Assertions.assertNotNull(student.getSchool().getId());
        Assertions.assertEquals(student.getSchool().getId(), studentDto.schoolId());
    }
}