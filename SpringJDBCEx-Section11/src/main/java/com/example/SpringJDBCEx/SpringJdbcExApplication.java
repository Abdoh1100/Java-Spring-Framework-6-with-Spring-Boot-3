package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.student;
import com.example.SpringJDBCEx.service.studentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);

		student st=context.getBean(student.class);
		st.setMarks(50);
		st.setName("abdo");
		st.setRonum(13);

		studentService service=context.getBean(studentService.class);
		service.addStudent(st);

		List<student> students=service.getStudents();
		System.out.println("List: "+students);


	}

}
