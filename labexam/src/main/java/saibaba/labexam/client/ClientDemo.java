package saibaba.labexam.client;

import saibaba.labexam.model.Employee;
import saibaba.labexam.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Constructor-based DI
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details: " + employee);

        // Setter-based DI with Autowiring
        Course course = (Course) context.getBean("course");
        System.out.println("Course Details: " + course);
    }
}
