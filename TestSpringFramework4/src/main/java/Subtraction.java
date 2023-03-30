public class Subtraction implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.subtraction();
    }

    public Subtraction(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
