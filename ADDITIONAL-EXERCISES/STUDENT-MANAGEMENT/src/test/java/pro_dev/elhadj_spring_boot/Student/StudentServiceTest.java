package pro_dev.elhadj_spring_boot.Student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentMapper studentMapper;

    @Mock
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shoud_successfully_save_a_student() {
        StudentDto studentDto = new StudentDto(
                "John",
                "Doe",
                "john@email.com",
                1
        );
        Student student = new Student(
                "John",
                "Doe",
                "john@email.com",
                20

        );

        Student savedStudent = new Student(
                "John",
                "Doe",
                "john@email.com",
                20

        );

        // Mocking the calls

        when(studentMapper.toStudent(studentDto))
                .thenReturn(student);
        when(studentRepository.save(student))
                .thenReturn(savedStudent);
        when(studentMapper.toStudentResponseDto(savedStudent))
                .thenReturn(new StudentResponseDto(
                        "John",
                        "Doe",
                        "john@email.com"
                ));


        // When
        StudentResponseDto studentResponseDto = studentService.saveStudent(studentDto);

        // Then
        Assertions.assertEquals(studentDto.firstname(), studentResponseDto.firstname());
        Assertions.assertEquals(studentDto.lastname(), studentResponseDto.lastname());
        Assertions.assertEquals(studentDto.email(), studentResponseDto.email());

        verify(studentMapper, times(1))
                .toStudent(studentDto);
        verify(studentRepository, times(1))
                .save(student);
        verify(studentMapper, times(1))
                .toStudentResponseDto(savedStudent);
    }
}
