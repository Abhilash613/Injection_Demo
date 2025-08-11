package org.example;

public class App {
    public static void main(String[] args) {
        Student s=new Student();
        s.course=new DSA();//Field dependancy injection
        //under new JavaFullStack() you can push
//manually dependency injection
//        Course course=new DSA();
//        s.setCourse(course);
        s.Study();
    }
}


//in manual injection we need to make variable public otherwise it will not available outside the class

//But in springcore we don't need to make it public it handle automatically.Because Spring uses reflection API.
//What is Spring Bean ?

//Any java class whose lifecycle (Creation to destruction) is managed by IOC is called spring bean.