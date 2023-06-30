package Draw;



import toys.Toy;

public class Draw {
    private Toy toy;
    private int start;
    private int end;

    public Draw() {
    }

    public Toy getToy() {
        return this.toy;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
