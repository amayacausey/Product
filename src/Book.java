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
    //Override
    public String toString() {

        String msg = super.toString();
        return msg = msg +"Pages:               " + pages + "\n" +
                "Author:              " + author+ "\n";
    }
    //Overload
    public boolean equals(String code,String author,int pages) {
        if(code.equalsIgnoreCase(this.code)&&(author.equalsIgnoreCase(this.author))&&(pages==this.pages))
        {
            return true;
        }else
        {
            return false;
        }
    }
}

