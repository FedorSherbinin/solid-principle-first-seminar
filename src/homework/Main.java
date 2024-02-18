package homework;

import homework.model.User;
import homework.model.impl.DatabasePersister;
import homework.model.impl.FilePersister;
import homework.model.view.UserPersister;
import homework.model.view.UserReporter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        UserPersister databaseUserPersister = new UserPersister(new DatabasePersister());
        UserPersister fileUserPersister = new UserPersister(new FilePersister());

        UserReporter.report(user);
        databaseUserPersister.save(user);
        fileUserPersister.save(user);
    }
}