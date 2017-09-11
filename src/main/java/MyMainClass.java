import ee.comp.myservingpackage.MyService;
import ee.comp.myservingpackage.NewBookInfo;
import ee.comp.myservingpackage.OldBookDataHolder;

import java.util.List;

public class MyMainClass {
    public static void main (String[] args){
        MyService ms = new MyService();

        NewBookInfo nb = new NewBookInfo();
        nb.setNt("Title");
        OldBookDataHolder ob = new OldBookDataHolder();
        ob.setOt("Old Title");

        ms.add(nb);
        ms.add(ob);

        List books = ms.getNewItemsArrayWhenNull();
        books.add(nb);
        books.add(ob);

        System.out.println(ms.getOSS());
        if(ms.anyBooks()) {
            ms.displaymystuff();
        }
    }
}