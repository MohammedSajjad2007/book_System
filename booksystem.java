class book{
    private String tital;
    private String authtor;
    private double price;

    book(String t , String a , double p){
        this.tital = t;
        this.authtor = a;
        this.price = p;

    }
    public String getTital(){
        return tital;
    }
    public String getAuthtor(){
        return authtor;
    }
    public double getPrice(){
        return price;
    }
     public double applydiscount(double x){
            double disprice =price - (price * x / 100);
            return disprice;

      }
     public void displaydetail(){
          System.out.println("Book Tital: " + getTital());
          System.out.println("Book Author Name: " + getAuthtor());
          System.out.println("Price: " + getPrice());
          System.out.println("Discounted price: " + applydiscount(25));
      }
}
class library{
    public static void main(String args[]){
        book b1 = new book("Renegade Immortal", "Er Gen" , 1500.00);

        b1.displaydetail();
    }
}