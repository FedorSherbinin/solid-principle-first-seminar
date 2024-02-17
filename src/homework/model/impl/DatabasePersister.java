package homework.model.impl;

import homework.model.Persistent;
import homework.model.view.Persister;
import homework.model.view.User;

// Реализация Persister для сохранения в базу данных
public class DatabasePersister extends Persister implements Persistent {
    public void save(User user) {
        System.out.println("Сохранение пользователя в базу данных: " + user.getName());
    }
}
