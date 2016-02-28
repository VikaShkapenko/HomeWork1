/** 
* Created by Vika on 26.02.2016. 
*/


public class Main {
    public static void main(String[] args) {
        Products products = new Products();

 products.setName("Phone");
 products.setManufacturer("FirmSamsung");
 products.setMark("SamsungGalaxyA3");
 products.setWeight(135);
 products.setPrice(7999);

        System.out.println(products.read());
    }
}
