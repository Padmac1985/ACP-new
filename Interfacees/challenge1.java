// Make a class book with title, author, number of pages. Make a constructor which will take the inputs. Make a get title function, which will return title.
// Make get author and get number of pages.
 class book {
    private String title;
    private String author;
    private int numberofpages;
     book( String title1, String author1, int numberofpages1) {
        title =  title1;
        author = author1;
        numberofpages = numberofpages1;

    }
    public String gettitle() {
        return  title;
    }
    public String getauthor() {
        return author;
    }
    public int getnumberofpages() {
        return numberofpages;
    }
}


public class challenge1 {
    public static void main (String[] args) {
        book x = new book(" Animal Farm", "George Orwell", 100);
        String result1 = x.gettitle();
        System.out.println( " the title of the book is " + result1);
        String result2 = x.getauthor();
        System.out.println ( " The author's name is " + result2);
        int result3 = x.getnumberofpages();
        System.out.println(" The number of pages in the book is " + result3);




    }
    
}
