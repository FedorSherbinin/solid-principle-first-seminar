package homework.model.view;

import homework.model.User;
import homework.model.view.Persister;

public class UserPersister extends Persister {
    private final Persister persister;

    public UserPersister(Persister persister) {
        this.persister = persister;
    }

    public void save(User user) {
        persister.save(user);
    }

    public void delete(User user) {
        persister.delete(user);
    }
}