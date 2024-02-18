package homework.model.impl;

import homework.model.Persistent;
import homework.model.User;
import homework.model.view.Persister;

// Реализация Persistent для сохранения в файл
public class FilePersister extends Persister implements Persistent {
    public void save(User user) {
        // Логика сохранения в файл
        System.out.println("Сохранение пользователя в файл: " + user.getName());
    }

    public void delete(User user) {
        // Логика удаления из файла
        System.out.println("Удаление пользователя из файла: " + user.getName());
    }
}