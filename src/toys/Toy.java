package toys;

public class Toy {
    protected int toyId;
    protected String name;
    protected int drawWeight;
    protected int price;

    public Toy() {
    }

    public int getToyId() {
        return this.toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrawWeight() {
        return this.drawWeight;
    }

    public void setDrawWeight(int drawWeight) {
        this.drawWeight = drawWeight;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Toy{toyId=" + this.toyId + ", name='" + this.name + "', drawWeight=" + this.drawWeight + ", price=" + this.price + "}";
    }
}
