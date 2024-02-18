package homework.model.view;

import homework.model.User;

public class UserReporter {
    public static void report(User user) {
        System.out.println("Отчет о пользователе: " + user.getName());
    }
}