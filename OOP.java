public class OOP {
    public static void main(String[] args) {
    Product product = new Product("Chair", 500.0);
    Electronics electronics = new Electronics("Televission", 20000.0, "Sumsung");
    Electronics electronics2 = new Electronics("Iphone", 40000.0, "Apple");
    Book book = new Book("OOP Programming", 250.0, 300);

    product.getName();
    product.getPrice();

    electronics.getName();
    electronics.getPrice();
    electronics.getBrand();
    electronics.getModel();

    electronics2.getName();
    electronics2.getPrice();
    electronics2.getBrand();

    book.getName();
    book.getPrice();
    book.getPages();
    
       
        
    }
}
class Product{
    private String Name;
    private double price;

     Product(String Name , double price){
        this.Name = Name;
        this.price = price;
     }

   
    public void getName(){
        System.out.println(this.Name);
    }
    public void setName(String setname){
        this.Name = setname;
        
    }
     public void getPrice(){
        System.out.println(this.price);
    }
    public void setPrice(double setprice){
        this.price = setprice;
     
    }
}
class Electronics extends Product{
    private String brand;
    Electronics(String Name , double price , String brand){
        super(Name, price);
        this.brand = "Neo QLED";
    }
     private String Model;
     Electronics(String Name , double price , String Model){
        super(Name, price);
        this.Model = Model;
     }
    public void getBrand(){
        System.out.println("Brand :" + this.brand );
    }
    public void setBrand(String setbrand){
        this.brand = setbrand;
        
    }
     public void getModel(){
        System.out.println("Model :" +this.Model );
    }
    public void setModel(String setmodel){
        this.Model = setmodel;
       
       
    }


}

class Book extends Product{
    private String author;
     Book(String Name , double price , String author){
        super(Name, price);
        this.author = author;

        
    }
    private int pages;
     Book(String Name , double price , int pages){
        super(Name, price );
        this.pages = pages;
     
    }
     
    public void getAuthor(){
        System.out.println(this.author);
    }
    public void setAuthor(String newauthor){
        this.author = newauthor;
        
    }
     public void getPages(){
        System.out.println(this.pages);
    }
    public void setPages(int newpages){
       this.pages = newpages;
       
    }
}
class Smartphone extends Electronics{
    private String OperatingSystem;
    Smartphone(String Name , double price , String OperatingSystem){
        super(Name, price, OperatingSystem)
        this.OperatingSystem = OperatingSystem;

    }

     public void getOperatingSystem(){
        System.out.println(this.OperatingSystem);
    }
    public void setOperatingSystem(String newOperatingSystem){
        this.OperatingSystem = newOperatingSystem;
        
    }
}
