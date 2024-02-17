package homework.model.view;

import homework.model.view.Persister;

public class User {
    private final String name;
    private final Persister persister;

    public User(String name, Persister persister) {
        this.name = name;
        this.persister = persister;
    }

    public String getName() {
        return name;
    }

    public void save() {
        persister.save(this);
    }

    public void report() {
        System.out.println("Отчет о пользователе: " + name);
    }
}