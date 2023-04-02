public class Book {
    private String title;
    private Aurhor author;
    private Integer year;

    public Book(String title, Aurhor author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public  String getTitle(){
        return  title;
    }
    public Aurhor getAuthor() {
        return  author;
    }
    public Integer getYear(){
        return year;
    }
    public  void  setYear (Integer year){
        this.year = year;
    }
}
