package homework.model;

public interface Persistent {
    void save(User user);
    void delete(User user);
}