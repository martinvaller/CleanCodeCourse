package ee.comp.myservingpackage;

import java.util.ArrayList;
import java.util.List;

public class MyService {

    private List b;


    public boolean isAllowed(){
        if(b.size()==5){ //Maximum 5 books can be added
            return false;
        }
        return true;
    }

    public void add(Object book){
        if(b == null){
            b = new ArrayList();
        }

        if(isAllowed()){
            b.add(book);
        }
    }

    public List getNewItemsArrayWhenNull(){
        if(b == null){
            b = new ArrayList();
        }
        return b;
    }

    public int getOSS(){
        int pi = 0;
        for(Object p: b)if(p instanceof NewBookInfo)pi+= 1;
        return pi;
    }

    public boolean anyBooks(){
        int a = b.size();
        return a>0;
    }

    public List displaymystuff(){
        for(Object o: b){
            if(o instanceof OldBookDataHolder){
                System.out.println(((OldBookDataHolder) o).getOt());
            }else if(o instanceof NewBookInfo){
                System.out.println(((NewBookInfo) o).getNt());
            }
        }
        return null;
    }
}