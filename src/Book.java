public class Book extends Product {

    private String author;
    private int pages;
    public Book(){
    }
    public Book(String author,int pages){
        this.author=author;
        this.pages=pages;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public int getPages(){
        return this.pages;
    }

}

