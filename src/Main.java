public class Main {
    public static void main(String[] args) {
    Aurhor pushkin = new Aurhor("Александр", "Пушкин");
    Aurhor lermontov = new Aurhor("Михаил", "Лермонтов");

    Book capitanDaughter =new Book("Капитанская дочка ", pushkin,1836);
    Book demon = new Book("Демон", lermontov,1839);
        System.out.println("Заголовок книги " + capitanDaughter.getTitle());
        System.out.println("Год издание книги  " + capitanDaughter.getYear());

        capitanDaughter.setYear(1841);
        System.out.println("Год переиздания книги  " + capitanDaughter.getYear());
    }
}