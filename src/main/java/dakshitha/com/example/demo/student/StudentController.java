package dakshitha.com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentServ;

    private final StudentService stu2 = new StudentService();


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentServ = studentService;
        System.out.println("inside constructor");
    }

    @GetMapping("/details")
    public List<Student> getStudents(){
        return studentServ.getStudents();
    }

    @GetMapping("/info")
    public String method1(){
        return studentServ.method();
    }
}
