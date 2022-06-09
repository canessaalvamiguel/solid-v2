interface IDatabase{
    void save();
}
class UserDao{
    IDatabase  dataBase;

    public UserDao(IDatabase dataBase) {
        this.dataBase = dataBase;
    }

    public void save(){
        dataBase.save();
    }
}

class MySQLDatabase implements IDatabase{
    @Override
    public void save(){

    }
}

class MongoDB implements IDatabase{
    @Override
    public void save(){

    }
}

public class DependencyInversion{
    public static void main(String[] args){
        IDatabase database = new MySQLDatabase();
        //IDatabase database = new MongoDB();
        UserDao userDao = new UserDao(database);
        userDao.save();
    }
}