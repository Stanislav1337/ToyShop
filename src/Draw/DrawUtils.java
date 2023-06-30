package Draw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import toys.Toy;
import toyscatalogue.ToysCatalogue;

public class DrawUtils {
    public DrawUtils() {
    }

    public static LinkedList<Draw> createDrawList(ArrayList<ToysCatalogue> stock) {
        LinkedList<Draw> drawlist = new LinkedList();
        int i = 0;
        Iterator var3 = stock.iterator();

        while(var3.hasNext()) {
            ToysCatalogue item = (ToysCatalogue)var3.next();
            if (item.getQuantity() != 0) {
                Draw drawItem = new Draw();
                drawItem.setToy(item.getToys());
                drawItem.setStart(i);
                i += item.getToys().getDrawWeight();
                drawItem.setEnd(i);
                drawlist.addLast(drawItem);
            }
        }

        return drawlist;
    }

    public static Toy drawChose(LinkedList<Draw> drawList) {
        if (drawList.size() != 0) {
            int maximum = ((Draw)drawList.getLast()).getEnd();
            Random random = new Random();
            int drawWin = random.nextInt(0, maximum);
            Iterator var4 = drawList.iterator();

            while(var4.hasNext()) {
                Draw item = (Draw)var4.next();
                if (drawWin >= item.getStart() && drawWin <= item.getEnd()) {
                    return item.getToy();
                }
            }
        }

        return null;
    }

    public static void drawResult(ArrayList<ToysCatalogue> stock, LinkedList<Toy> prizeQueue) {
        LinkedList<Draw> drawList = createDrawList(stock);
        Toy drawToy = drawChose(drawList);
        if (drawToy != null) {
            Iterator var4 = stock.iterator();

            while(var4.hasNext()) {
                ToysCatalogue item = (ToysCatalogue)var4.next();
                if (item.getToys().equals(drawToy)) {
                    item.takeToy();
                }
            }

            prizeQueue.addLast(drawToy);
            System.out.println(drawToy.getName() + " drawed and added to Que");
        } else {
            System.out.println("stock is empty");
        }

    }
}
