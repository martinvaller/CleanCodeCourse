package ee.comp.myservingpackage;

import java.util.ArrayList;
import java.util.List;

public class MyService {

    private List books;


    public boolean isAllowed(){
        if(books.size()==5){ //Maximum 5 books can be added
            return false;
        }
        return true;
    }

    public void add(Object book){
        if(books == null){
            books = new ArrayList();
        }

        if(isAllowed()){
            books.add(book);
        }
    }

    public List getNewItemsArrayWhenNull(){
        if(books == null){
            books = new ArrayList();
        }
        return books;
    }

    public int getOSS(){
        int pi = 0;
        for(Object p: books)if(p instanceof NewBookInfo)pi+= 1;
        return pi;
    }

    public boolean anyBooks(){
        int a = books.size();
        return a>0;
    }

    public List displaymystuff(){
        for(Object o: books){
            if(o instanceof OldBookDataHolder){
                System.out.println(((OldBookDataHolder) o).getOt());
            }else if(o instanceof NewBookInfo){
                System.out.println(((NewBookInfo) o).getNt());
            }
        }
        return null;
    }
}