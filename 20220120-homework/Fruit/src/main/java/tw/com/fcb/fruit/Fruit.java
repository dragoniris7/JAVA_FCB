package tw.com.fcb.fruit;

public class Fruit {

    private String code;
    private String name;
    private String Origin;
    private String memo;
    private int price;

    @Override
    public String toString() {
        return "Fruit{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", Origin='" + Origin + '\'' +
                ", memo='" + memo + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

