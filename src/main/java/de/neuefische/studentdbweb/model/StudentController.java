package de.neuefische.studentdbweb.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student("1", "Super Pussy Cat"),
                new Student("2", "Crazy Crab"),
                new Student("3", "Daring Dragon")
        );
    }

    public Student getStudent(){
        return new Student("1", "Super Pussy Cat");
    }
}

/* @RestController
@RequestMapping ("1")
public class StudentController {
    @GetMapping

} */
