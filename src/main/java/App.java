import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());


        var bean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        var cat1 = applicationContext.getBean("catBean", Cat.class);
        var cat2 = applicationContext.getBean("catBean", Cat.class);

        System.out.println(bean1 == bean2);
        System.out.println(cat1 == cat2);
    }
}