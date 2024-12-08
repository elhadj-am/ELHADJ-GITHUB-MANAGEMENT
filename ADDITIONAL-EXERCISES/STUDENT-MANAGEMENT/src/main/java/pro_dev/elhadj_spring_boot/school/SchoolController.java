package pro_dev.elhadj_spring_boot.school;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {
    private final SchoolService schoolService;


    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/schools")
    public SchoolDto createNewSchool(@RequestBody SchoolDto schoolDto) {
        return schoolService.createNewSchool(schoolDto);
    }

    @GetMapping("/schools/{school-id}")
    public SchoolDto findSchool(Integer id) {
        return schoolService.getSchoolById(id);
    }

    @GetMapping("/schools")
    public List<SchoolDto> getSchools() {
        return schoolService.getAllSchools();
    }
}
