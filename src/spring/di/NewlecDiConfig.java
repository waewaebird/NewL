package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDiConfig {
    @Bean // spring이 직접 호출, IoC 컨테이너에 담아둠.
    public Exam exam() {
        return new NewlecExam();
    }
}
