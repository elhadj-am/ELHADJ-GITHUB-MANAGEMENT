package pro_dev.elhadj_spring_boot.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public  List<Student> findAllByFirstnameContaining(String firstname);
}
