import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        B b = context.getBean("classB", B.class);

        b.sayB();
        b.sayA();

        context.close();

    }
}
