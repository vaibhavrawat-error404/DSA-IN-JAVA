public class Cars {
    String brand;
    String model;
    int year;
    String color;
    int price;

    Cars(){
        brand = "Alto";
        model = "Family";
        year = 2015;
        color = "Black";
        price = 20000;
//        System.out.println("Default Constructor Called");
    }

    Cars(String brand, String model, int year, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
//        System.out.println("Parametrized Constructor Called");
    }

    Cars(Cars obj){
        this.brand = obj.brand;
        this.model = obj.model;
        this.year = obj.year;
        this.color = obj.color;
        this.price = obj.price;
//        System.out.println("Copy Constructor Called");
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("____________________________");
    }

}
void main(){
    Cars c1 = new Cars();
    c1.display();

    Cars c2 = new Cars(c1);
    c2.display();

    Cars c3 = new Cars("Mercedez","Benz",2025,"Carbon Fibre",20000000);
    c3.display();
}