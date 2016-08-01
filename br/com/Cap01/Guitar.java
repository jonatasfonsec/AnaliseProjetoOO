/*
	Classe guitarra - Uma guitarra é composta por: Número de série, Fabricante, Modelo, 
	tipo, Madeira-Traseira, Madeira-Topo, Preço.
*/
public class Guitar {
   
   //Declarando Atributos de Guitarra.
   private String serialNumber, builder, model, type, backWood, topWood;
   private double price;
   
   //Classe construtora
   public Guitar(String serialNumber, double price,
                 String builder, String model, String type,
				 String backWood, String topWood)  {
   this.serialNumber = serialNumber;
   this.price = price;
   this.builder = builder;
   this.model = model;
   this.type = type;
   this.backWood = backWood;
   this.topWood = topWood;
 }
   //Métodos Getters & Setters
   public String getSerialNumber() {
    return serialNumber;
   }
   public double getPrice() {
    return price;
   }
   public void setPrice(float newPrice) {
    this.price = newPrice;
   }
   public String getBuilder() {
    return builder;
   }
   public String getModel() {
    return model;
   }
   public String getType() {
    return type;
   }
   public String getBackWood() {
    return backWood;
   }
   public String getTopWood() {
    return topWood;
   }
}
