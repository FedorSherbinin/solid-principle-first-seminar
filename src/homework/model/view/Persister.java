package homework.model.view;

public class Persister {
    public void save(User user) {
        System.out.println("Сохранение пользователя: " + user.getName());
    }
}