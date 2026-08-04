package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepo db;

    @PostMapping()
    Map<Object, Object> m1(@RequestBody Student s) {
        Map res = new HashMap<>();

        String name = s.getName();
        String email = s.getEmail();
        String ip = s.getIp();

        Student obj = new Student();

        obj.setName(name);
        obj.setEmail(email);
        obj.setIp(ip);

        db.save(obj);

        res.put("message", "welcome post api endpoint");
        res.put("status", 201);
        res.put("student", obj.getName());

        return res;
    }

}
