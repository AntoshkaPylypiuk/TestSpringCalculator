public class Addition implements Command {
    DataBase dataBase;

    public void execute() {
        dataBase.addition();
    }
    public Addition (DataBase dataBase){
        this.dataBase=dataBase;
    }
}
