package by.komikow.demo.repositories;

import by.komikow.demo.utils.Utilities;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Utilities utilities;

    @Override
    public Map<String, Integer> getCountChars(String string) {
        return utilities.getCharsMap(string);
    }
}
