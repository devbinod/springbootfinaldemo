package np.com.pantbinod.springbootfinaldemo.demo;

import np.com.pantbinod.springbootfinaldemo.model.Student;

public class StudentDemo {
    public static void main(String[] args) {

        Student student=new Student();
        student.setFirstName("Binod");
        System.out.println(student.getFirstName());

    }
}
