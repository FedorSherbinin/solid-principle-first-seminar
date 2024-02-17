package homework;

import homework.model.impl.DatabasePersister;
import homework.model.view.Persister;
import homework.model.view.User;

public class Main{
    public static void main(String[] args){
        Persister databasePersister = new DatabasePersister(); // Используем DatabasePersister для сохранения в базу данных
        User user = new User("Bob", databasePersister);

        user.report();
        user.save();
    }
}