import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DataBaseRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DataBase.class);
        DataBase dataBase = context.getBean(DataBase.class);

        dataBase.scanner();
        System.out.println(dataBase.getNumber1() + dataBase.getAction() + dataBase.getNumber2());
        dataBase.addition();
        dataBase.subtraction();
        dataBase.division();
        dataBase.multiplication();

        User user = new User(
                new Subtraction(dataBase),
                new Addition(dataBase),
                new Multiplication(dataBase),
                new Division(dataBase)
        );

        user.subtraction();
        user.addition();
        user.multiplication();
        user.division();
    }
}
