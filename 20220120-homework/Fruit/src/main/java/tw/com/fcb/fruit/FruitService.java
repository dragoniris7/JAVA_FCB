package tw.com.fcb.fruit;

import java.util.List;

public interface FruitService {
    public Fruit getByCode(String code);
    public List<Fruit> getByName(String name);
    public List<Fruit> getByPrice(int amt1 , int amt2);
    public List<Fruit> getByFruit(String name,int amt1,int amt2);
}
