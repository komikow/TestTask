package by.komikow.demo.repositories;

import java.util.Map;

public interface UserRepository {
    public Map<String, Integer> getCountChars(String string);
}
