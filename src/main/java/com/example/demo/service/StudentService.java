package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public Student createData(Student stu) {
        return repo.save(stu);
    }

    public List<Student> fetchRecord() {
        return repo.findAll();
    }
}