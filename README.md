# NewL

1.
엔터프라이즈 에디션 - 분산형, 기업형 웹 응용 프로그램
엔터프라이즈 에디션 - dao, service : DB 커넥션 관리가 서비스 계층 서비스 함수 jdbc커넥션 공유하기 어려운면이 있음.

스프링 : 라이브러리 쓰는 방법을,  Java EE영역을 Spring으로 대체함.

Spring
JAVA SE

웹 프로그램
MVC / Transaction / 인증과 권한

Di /    AOP 	  / Servlet Filter

느슨한 결합력과 인터페이스

2.
Layer => UI - Service - DAO - Data


Layer => UI - Service - InterFace(DAO) - DAO - Data
자료형 을 인터페이스로

객체의 생성과 조립을 외부파일 or외부설정으로(XML, Annotation)

3.
스프링에서 객체를 생성 조립해준다.

DI 쉽게 부품조리

- Composition has a 일체형
  class A {
  private B b; //종속객체, 부품

  public A() {
  b = new B(); //직접객체를 생성해서 갖음
  }
  }
  A a = new A(); // 이 안에서 어떤 부품이 있는지 알 수 없음


- Association has a 조립형
  class A {
  private B b;

  public A() {
  }

  public void setB(B b) {
  this.b = b; // 외부에서 생성된것을 갖고 있음
  }
  }
  B b = new B(); //Dependency
  A a = new A();

a.setB(b); //Injection
이렇게 조립형으로 하면 쉽게 부품을 바꿀수 있음
단점은, 조립을 해야하는 불편함이 있다.

두 가지 방식
Setter Injection : a.setB(b);
Construction Injection : A a = new A(b);

Spring의 가장 큰 능력은 부품조립이다! 스프링이 조립해줌.


4.
Ioc 컨테이너

부품 주문서 대로 부품을 생성해서 보관하는게 컨테이너

일체형에서는 더큰부품 + 큰부품 + 작은부품

조립형에서는 작은부품 + 큰부품 + 더큰부품 이렇게 조립

즉 조립형에서는 순서가 Inversion of Control



12.
스프링 어노테이션

결합상태를 바꾸기 위한 소스코드를 바꾸지 않고, 내용변경을 하기위해 xml설정으로 뺏었음.

13.
IoC 컨테이너 (객체를 담는 그릇)

16.
@Component 클래스는 모두 객체화 할 수 있음
MVC 웹 어플리케이션을 구성하는 업무 로직 및 코드 = component

@Controller
@Service
@Repository
@Component클래스의 명시화

Controller  - Service - Repository(Dao)

18.
기존 Object Oriented Programming
신규 기존 Aspect Oriented Programming

주 업무 로직외 개발자 or 운영자가 필요한 부가적인 코드, 관점이 다른 업무(로그 처리, 보안 처리, 트랜잭션 처리)
Cross-cutting Concern이라고 한다네

부업무
주업무
부업무

예전에는 주업무, 부업무 cutting 하기가 어려웠음.

부업무를 쉽게 뺏다 꽂았다 하는 방법 -> Proxy 


Cross-cutting Concern 먼저 호출 Core Concers 갔다와서 다시 Cross-cutting Concern























