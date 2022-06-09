class UserDao{
    MySQLDatabase  dataBase;

    public UserDao(MySQLDatabase  dataBase) {
        this.dataBase = dataBase;
    }

    public void save(){
        this.dataBase.save();
    }
}

class MySQLDatabase {
    public void save(){

    }
}

public class DependencyInversion{
    public static void main(String[] args){
        MySQLDatabase  dataBase = new MySQLDatabase ();
        UserDao userDao = new UserDao(dataBase);
        userDao.save();
    }
}