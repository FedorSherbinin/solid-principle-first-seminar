package homework.model.impl;

import homework.model.Persistent;
import homework.model.User;
import homework.model.view.Persister;

// Реализация Persister для сохранения в базу данных
public class DatabasePersister extends Persister implements Persistent {
    public void save(User user) {
        System.out.println("Сохранение пользователя в базу данных: " + user.getName());
    }

    public void delete(User user) {
        System.out.println("Удаление пользователя из базы данных: " + user.getName());
    }
}