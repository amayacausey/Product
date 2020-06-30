public class Main {
public static void main(String[] args){

        Book b = new Book();
        // use setters to set values
        b.setAuthor("Judy");
        b.setPages(100);
        b.setCode("5644");
        b.setDescription("How to learn Java in 1 day");
        b.setPrice(5.99);

        Book c = new Book();
        // use setters to set values
        c.setCode("8654");
        c.setDescription("This book will explore the pros and cons of learning Java.");
        c.setPrice(4.99);

        Software s = new Software();
        // use setters to set values
        s.setCode("7592");
        s.setDescription("This book well tell you the best language to learn for optimal success.");
        s.setPrice(10.99);

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
        }}