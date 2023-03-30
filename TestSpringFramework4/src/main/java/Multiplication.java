public class Multiplication implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.multiplication();
    }

    public Multiplication(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
