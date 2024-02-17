package homework.model.impl;

import homework.model.Persistent;
import homework.model.view.User;

// Реализация Persistent для сохранения в файл
public class FilePersister implements Persistent {
    public void save(User user) {
        // Логика сохранения в файл
        System.out.println("Сохранение пользователя в файл: " + user.getName());
    }
}
