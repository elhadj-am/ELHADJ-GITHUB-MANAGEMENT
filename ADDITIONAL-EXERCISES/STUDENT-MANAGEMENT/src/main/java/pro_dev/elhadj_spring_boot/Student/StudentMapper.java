package pro_dev.elhadj_spring_boot.Student;

import org.springframework.stereotype.Service;
import pro_dev.elhadj_spring_boot.Student.School;
import pro_dev.elhadj_spring_boot.Student.Student;
import pro_dev.elhadj_spring_boot.Student.StudentDto;
import pro_dev.elhadj_spring_boot.Student.StudentResponseDto;

@Service
public class StudentMapper {


    public Student toStudent(StudentDto studentDto) {
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
