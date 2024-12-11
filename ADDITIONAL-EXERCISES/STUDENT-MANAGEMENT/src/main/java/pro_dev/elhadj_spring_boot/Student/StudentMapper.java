package pro_dev.elhadj_spring_boot.Student;

import org.springframework.stereotype.Service;
import pro_dev.elhadj_spring_boot.school.School;

@Service
public class StudentMapper {


    public Student toStudent(StudentDto studentDto) {
        if (studentDto == null) {
            throw new NullPointerException("The student Dto should not be null");
        }
        var student = new Student();
        student.setFirstname(studentDto.firstname());
        student.setLastname(studentDto.lastname());
        student.setEmail(studentDto.email());
        var school = new School();
        school.setId(studentDto.schoolId());
        student.setSchool(school);
        return student;
    }

    public StudentResponseDto toStudentResponseDto(Student student) {
        return new StudentResponseDto(
                student.getFirstname(),
                student.getLastname(),
                student.getEmail());
    }
}
