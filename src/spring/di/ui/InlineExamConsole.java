package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
    @Autowired(required = false) //자동으로 객체를 연결해라
    @Qualifier("exam1")
    private Exam exam;

    public InlineExamConsole(Exam exam) {
        System.out.println("overload constructor");
        this.exam = exam;
    }

    public InlineExamConsole(){
        System.out.println("constructor");
    }

    @Override
    public void print() {
        if(exam == null) {
            System.out.printf("total is %d, avg is %f\n", 0, 0.0);
        } else {
            System.out.printf("total is %d, avg is %f\n",exam.total(), exam.avg());
        }
    }


    @Override
    public void setExam(Exam exam) {
        System.out.println("setter");
        this.exam = exam;
    }
}
