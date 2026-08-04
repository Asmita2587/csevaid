package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
@RequestMapping("/api")
public class Update {
@Autowired
StudentRepo db;

@PutMapping("/{id}")
public Map<Object, Object> updateStudent(@PathVariable Long id, @RequestBody Student s) {

    Map<Object, Object> res = new HashMap<>();
    String name = s.getName();
    String email = s.getEmail();
    String ip = s.getIp();

    Student obj = new Student();

    obj.setName(name);
    obj.setEmail(email);
    obj.setIp(ip);

    db.save(obj);

    res.put("message", "Student updated successfully");
    res.put("status", 200);
    res.put("student", obj.getName());

    return res;
}

}
