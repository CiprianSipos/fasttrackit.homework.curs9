package ro.fasttrackit.curs9.curs9.homework.ex1;

public class Main {
    public static void main(String[] args) {
        Cosmetics shampoo=new Cosmetics();
        shampoo.setProductName("Shampoo");
        shampoo.setProductDescription("For wahsing hair ");
        shampoo.setProductPrice(15);
        shampoo.setProductQuantity(5);
        shampoo.setColor("Blue");
        shampoo.setWheight(200);

        System.out.println("Selected product: " + shampoo.getProductName());
        System.out.println("Selected product description: "+ shampoo.getProductDescription());
        System.out.println("Selected product price: "+ shampoo.getProductPrice()+" lei");
        System.out.println("Selected product quantity: "+ shampoo.getProductQuantity());
        System.out.println("Selected product recipient color: "+ shampoo.getColor());
        System.out.println("Selected product wheight: "+ shampoo.getWheight()+" milliliters");
        System.out.println("___________");

        System.out.println("Select another product? ");
        Fridge fridge= new Fridge();
        fridge.setType("Frigider");
        fridge.setProductName("Arctic");
        fridge.setTemperature(4);
        System.out.println("Selected product type: " +fridge.getType());
        System.out.println("Selected product name : "+fridge.getProductName());
        System.out.println("Temperature: "+fridge.getTemperature());



    }
}
