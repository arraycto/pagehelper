package com.example.demo.controller;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制层
 */
@RestController
@RequestMapping(value = "/api")
public class StudentController {
    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public boolean addStudent(@RequestBody Student student) {
        System.out.println("开始新增...");
        return service.insert(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    public boolean updateStudent(@RequestBody Student student) {
        System.out.println("开始更新...");
        return service.update(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public boolean delete(@RequestBody Student student) {
        System.out.println("开始删除...");
        return service.delete(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> findByStudent(Student student, int pageNum, int pageSize) {
        System.out.println("开始查询...");
        return service.findByListEntity(student, pageNum, pageSize);
    }
}
