package tw.com.fcb.fruit;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitServiceImp implements FruitService{
    Map<String,Fruit> myfruit = new HashMap<String,Fruit>();

    public FruitServiceImp() {
        Fruit fruit1 = new Fruit();
        fruit1.setCode("A01");
        fruit1.setName("apple");
        fruit1.setOrigin("TW");
        fruit1.setMemo(" ");
        fruit1.setPrice(15);

        Fruit fruit2 = new Fruit();
        fruit2.setCode("A02");
        fruit2.setName("kiwi");
        fruit2.setOrigin("TW");
        fruit2.setMemo("黃金");
        fruit2.setPrice(18);

        Fruit fruit3 = new Fruit();
        fruit3.setCode("A03");
        fruit3.setName("kiwi");
        fruit3.setOrigin("TW");
        fruit3.setMemo("綠色");
        fruit3.setPrice(12);

        Fruit fruit4 = new Fruit();
        fruit4.setCode("B01");
        fruit4.setName("apple");
        fruit4.setOrigin("JP");
        fruit4.setMemo(" ");
        fruit4.setPrice(20);

        myfruit.put(fruit1.getCode(),fruit1);
        myfruit.put(fruit2.getCode(),fruit2);
        myfruit.put(fruit3.getCode(),fruit3);
        myfruit.put(fruit4.getCode(),fruit4);
    }

    public Fruit getByCode(String code){
        return myfruit.get(code);
    }

    public List<Fruit> getByName(String name){
        List nameList = new ArrayList();

        for(String key: myfruit.keySet()){
            Fruit thisFruit = myfruit.get(key);
            if(thisFruit.getName().equals(name)){
                nameList.add(thisFruit);
            }
        }
        return nameList;
    }

    public List<Fruit> getByPrice(int amt1,int amt2){
        List priceList = new ArrayList();
        for(String key:myfruit.keySet()){
            if(myfruit.get(key).getPrice() >= amt1 && myfruit.get(key).getPrice() <= amt2){
                priceList.add(myfruit.get(key));
            }
        }
        return priceList;
    }

    public List<Fruit> getByFruit(String name,int amt1,int amt2){
        Map<String,Fruit> selFruit = new HashMap<String,Fruit>();
        List<Fruit> selPrice = new ArrayList<Fruit>();
        for(String key: myfruit.keySet()){
            if(myfruit.get(key).getName().equals(name)){
                selFruit.put(myfruit.get(key).getCode(),myfruit.get(key));
            }
        }
        for(String inx : selFruit.keySet() ){
            if (selFruit.get(inx).getPrice() >= amt1 && selFruit.get(inx).getPrice() <= amt2){
                selPrice.add(selFruit.get(inx));
            }
        }
        return selPrice;
    }
}
