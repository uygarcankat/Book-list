import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class BookList {

    public static void main(String[] args) {

        Map<String, String> bookmap=new HashMap<>();
        ArrayList<Book>booklist=new ArrayList<>();

        booklist.add(new Book("Siyah", 476,2017-8-21,"Ahmet"));
        booklist.add(new Book("Mavi", 325,2014-4-20,"Ahmet"));
        booklist.add(new Book("Yeşil",440,2018-10-28,"Mehmet"));
        booklist.add(new Book("Turuncu",180,1996-4-24,"Ayşe"));
        booklist.add(new Book("Sarı",528,2000-1-16,"Fatma"));
        booklist.add(new Book("Mor",64,2006-2-25,"Hayriye"));
        booklist.add(new Book("Kahve",432,2000-9-16,"Samet"));
        booklist.add(new Book("Lila",294,2002-3-18,"Selin"));
        booklist.add(new Book("Kırmızı",85,2009-8-21,"Yaman"));
        booklist.add(new Book("Beyaz",294,1998-2-4,"Nisa"));


        booklist.stream().forEach(x-> bookmap.put(x.getName(), x.getAuthor()));

       List<Book> higher= booklist.stream().filter(p->p.getPageNum()>100).toList();

        higher.stream().forEach(book -> System.out.println("Kitap : "+book.getName()+
                " , " + "Sayfa : "+book.getPageNum()+" , " +
                    "Yazar : "+book.getAuthor()+" , "+
                    "Tarih : "+book.getDate()));




    }
}
