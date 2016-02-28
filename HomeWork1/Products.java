/** 
* Created by Vika on 26.02.2016. 
*/


public class Products {
  protected String name;
  protected String manufacturer;
  protected String mark;
  protected int weight;
  protected int price;

  public void setName(String name) {
    this.name = name;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setPrice(int price) {
    this.price = price;
  }

   public String read() {
      String result = "About Products \nName: " + this.name + "\nManufacturer: " + this.manufacturer + "\nMark: " + this.mark + "\nWeight: " + this.weight + "\nPrice: " + this.price;
      return result;
   }
}
