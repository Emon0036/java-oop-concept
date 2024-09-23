

abstract class LibraryReasource extends Thread{
    String title;
    String author;
    int yearOfPulication;
    boolean isAvailable;

    LibraryReasource(String title , String author , int yearOfPulication , boolean isAvailable){

        this.title = title;
        this.author = author;
        this.yearOfPulication = yearOfPulication;
        this.isAvailable = isAvailable;
    }


    abstract void displayInfo();

    void borrowResourece(){
        isAvailable = false;
        System.out.println("The resource has been borrowed");
    }

    void returnResourece(){
        isAvailable = true;
        System.out.println("The resource has been returned");
    }


}


interface Reservable{
    void reserveReasource();
    void cancelReservation();
}



class Book extends LibraryReasource implements Reservable{
  Book(String title , String author , int yearOfPulication , boolean isAvailable){
      super(title ,  author ,  yearOfPulication ,  isAvailable);
  }
    public void displayInfo(){
        System.out.println("The title of the book:"+title);
        System.out.println("The author of the book:"+author);
        System.out.println("Year of publication:"+yearOfPulication);
        System.out.println("Available status:"+isAvailable);
    }


   public void reserveReasource(){
            if(isAvailable){
                isAvailable = false;
                System.out.println(title+"This book has been reserve");
            }

            else{
                System.out.println(title +"This book has been out of stock or borrowed");
            }
     }

     public void cancelReservation(){
           if(!isAvailable){
               isAvailable = true;
               System.out.println(title + "reservation has been canceled");
           }
           else{
               System.out.println(title + "is not reserved");
           }
     }


}

class Magazine extends LibraryReasource {
   Magazine(String title , String author , int yearOfPulication , boolean isAvailable){
        super(title ,  author ,  yearOfPulication ,  isAvailable);
    }
    public void displayInfo(){
        System.out.println("The title of this magazine:"+title);
        System.out.println("The author of this magazine:"+author);
        System.out.println("Year of publication:"+yearOfPulication);
        System.out.println("Available status:"+isAvailable);
    }


}

class DVD extends LibraryReasource implements Reservable{
   DVD(String title , String author , int yearOfPulication , boolean isAvailable){
        super(title ,  author ,  yearOfPulication ,  isAvailable);
    }
    public void displayInfo(){
        System.out.println("The title of this video:"+title);
        System.out.println("The creator of the video:"+author);
        System.out.println("Year of publication:"+yearOfPulication);
        System.out.println("Available status:"+isAvailable);
    }


    public void reserveReasource(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(title+"This book has been reserve");
        }

        else{
            System.out.println(title +"This book has been out of stock or borrowed");
        }
    }

    public void cancelReservation(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println(title + "reservation has been canceled");
        }
        else{
            System.out.println(title + "is not reserved");
        }
    }


}




public class Main{
    public static void main(String[] args) {
          LibraryReasource Book = new Book("The Great Gatsby" , "F.Scott Fitzgerald" , 1925,)
    }

}







