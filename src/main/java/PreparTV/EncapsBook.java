package PreparTV;

public class EncapsBook {

    private String name ;
    private  String author;
    public  String publisher;
    public int numberOfPage;



    EncapsBook(String name, int numberOfPage, String author, String publisher){

        this.name=name;
        this.author= author;
        this.publisher= publisher;
        if (numberOfPage < 1) {
            this.numberOfPage = 5;
        } else{
            this.numberOfPage = numberOfPage;
        }
        ithaf();
        showBookData();
    }

    private void ithaf() {
        System.out.println("bu kitap M. k. Atatürk e ithaf edilmşitir");
    }

    public void showBookData(){
        System.out.println(" sayfa numarası : " + numberOfPage +
                           " \nkitabın yazarı : " + author +
                           " \nyayınevi : " + publisher +
                           " \nkitabın adı : " + name );
    }

}
