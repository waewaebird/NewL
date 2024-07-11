package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /* 스프링에게 지시하는 방법으로 코드를 변경 / 생성 조립
        Exam exam = new NewlecExam();
        Exam exam = new NewlecExam(10,10,10,10);
        ExamConsole console = new GridExamConsole();
        console.setExam(exam);
        */

        //지시서를 넘기는 주체 / 지시서를 넘기는 객체 ApplicationContext 인터페이스
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(NewlecDiConfig.class);

        //Exam exam = context.getBean(Exam.class);
        //System.out.println(exam.toString());
        ExamConsole console = (ExamConsole) context.getBean("console");
        //ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

        /*List<Exam> exams = (List<Exam>) context.getBean("exams");
        for(Exam e : exams) {
            System.out.println(e);
        }*/
    }
}
