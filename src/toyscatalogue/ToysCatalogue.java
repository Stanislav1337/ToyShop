package toyscatalogue;

import toys.Toy;

public class ToysCatalogue {
    protected int quantity;
    protected Toy toys;

    public ToysCatalogue() {
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Toy getToys() {
        return this.toys;
    }

    public void setToys(Toy toys) {
        this.toys = toys;
    }

    public void takeToy() {
        if (this.quantity > 0) {
            --this.quantity;
        }

    }

    public String toString() {
        int var10000 = this.quantity;
        return "ToysCatalogue{quantity=" + var10000 + ", toys=" + this.toys.toString() + "}";
    }
}
