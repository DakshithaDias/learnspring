package dakshitha.com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public String method(){
        return "This is inside service class method";
    }
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Dakshitha",
                        32,
                        LocalDate.of(1991, 12, 19),
                        "dakshithadias@gmail.com"

                ),
                new Student(
                        2L,
                        "Dhanya",
                        27,
                        LocalDate.of(1996,12,11),
                        "db@gmail.com"
                )

        );
    }
}
