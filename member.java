import java.util.ArrayList;
import java.util.List;
public class member {
    private String membername;
    private int memberid;
    private List<bookss> borrowedbooks;

    public member(String membername,int memberid){
        this.memberid = memberid;
        this.membername=membername;
        this.borrowedbooks = new ArrayList<>();
    }

    public String getMembername(){
        return membername;
    }

    public int getMemberid(){
        return memberid;
    }

    public void borrowbooks(bookss book){
        addbooktoborrowedbooks(book);
        System.out.println(book.getTitle()+ " Book is borrowed successfully!");
    }

    public void removebooks(bookss book){
        removebookfromborrowedbooks(book);
        System.out.println(book.getTitle()+ " Book is returned successfully!");
    }

    public void addbooktoborrowedbooks(bookss book ){
        borrowedbooks.add(book);
    }

    public void removebookfromborrowedbooks(bookss book){
        borrowedbooks.remove(book);
    }

    public List<bookss> getBorrowedbooks(){
        return borrowedbooks;

    }

}
