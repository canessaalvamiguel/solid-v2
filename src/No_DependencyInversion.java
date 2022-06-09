class UserDao_{
    MySQLDatabase_  dataBase;

    public UserDao_(MySQLDatabase_  dataBase) {
        this.dataBase = dataBase;
    }

    public void save(){
        this.dataBase.save();
    }
}

class MySQLDatabase_{
    public void save(){

    }
}

public class No_DependencyInversion{
    public static void main(String[] args){
        MySQLDatabase_ dataBase = new MySQLDatabase_();
        UserDao_ userDao = new UserDao_(dataBase);
        userDao.save();
    }
}