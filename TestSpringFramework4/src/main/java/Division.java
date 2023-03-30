public class Division implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.division();
    }

    public Division(DataBase dataBase) {
        this.dataBase = dataBase;
    }

}
