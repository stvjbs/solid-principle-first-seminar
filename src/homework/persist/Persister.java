package homework.persist;

import homework.User;

public class Persister implements Persistable{

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
