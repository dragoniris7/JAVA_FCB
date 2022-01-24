package tw.com.fcb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitServiceImp implements FruitService{
    Map<String,Fruit> myFruit = new HashMap<String,Fruit>();

    public FruitServiceImp() {
        Fruit fruit1 =new Fruit();
        fruit1.setCode("A01");
        fruit1.setName("apple");
        fruit1.setPrice(20);

        Fruit fruit2 =new Fruit();
        fruit2.setCode("A02");
        fruit2.setName("banana");
        fruit2.setPrice(10);

        Fruit fruit3 =new Fruit();
        fruit3.setCode("B02");
        fruit3.setName("apple");
        fruit3.setPrice(50);
        myFruit.put(fruit1.getCode(), fruit1);
        myFruit.put(fruit2.getCode(), fruit2);
        myFruit.put(fruit3.getCode(), fruit3);
    }

    public Fruit getByCode(String code) {
        return  myFruit.get(code);
    }
    public  List<Fruit> getByName (String name){
            List result = new ArrayList();
        for(String key : myFruit.keySet()){
            if(myFruit.get(key).getName().equals(name)){
                result.add(myFruit.get(key));
            }else{
                System.out.println("no add");
            }
        }
        return result;
    }
}


