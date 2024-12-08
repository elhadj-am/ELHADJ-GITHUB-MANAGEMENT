package pro_dev.elhadj_spring_boot.school;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;


    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolDto createNewSchool(SchoolDto schoolDto) {
        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool =  schoolRepository.save(school);
        return schoolMapper.toSchoolDto(savedSchool);
    }

    public SchoolDto getSchoolById(Integer id) {
        School school = schoolRepository.findById(id).orElse(new School());
        return schoolMapper.toSchoolDto(school);
    }

    public List<SchoolDto> getAllSchools() {
        return schoolRepository.findAll()
                .stream()
                .map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }
}
