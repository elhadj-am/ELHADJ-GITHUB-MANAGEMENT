package pro_dev.elhadj_spring_boot.studentProfile;

import jakarta.persistence.*;
import pro_dev.elhadj_spring_boot.Student.Student;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer id;
    private String bio;


    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public StudentProfile() {}




}
