package homework.model.view;

import homework.model.Persistent;
import homework.model.User;

public class Persister implements Persistent {
    public void save(User user) {
        System.out.println("Сохранение пользователя: " + user.getName());
    }

    public void delete(User user) {
    }
}
