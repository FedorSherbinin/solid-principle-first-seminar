package homework.model;

import homework.model.view.User;

public interface Persistent {
    void save(User user);
}
