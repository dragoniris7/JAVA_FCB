package tw.com.fcb;

import java.util.List;

public interface FruitService {
    public Fruit getByCode(String code);
    public List<Fruit> getByName (String name);
}
