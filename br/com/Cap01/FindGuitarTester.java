public class FindGuitarTester {
 public static void main(String args[] ){
  Inventory inventory = new Inventory();
  initializeInventory(inventory);
  
  Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER,
	"Stratocastor",Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
  Guitar guitar = inventory.search(whatErinLikes);
  if (guitar != null) {
   System.out.println("Erin, talvez você goste desta " +
    guitar.getBuilder() + " " + guitar.getModel() + " " +
	guitar.getType() + "guitar:\n " +
	guitar.getBackWood() +" na traseira e laterais, \n " +
	guitar.getTopWood() + "no tampo.\nEla pode ser sua por apenas US$" +
	guitar.getPrice() + "!");
  }else{
   System.out.println("Desculpe, Erin, nao temos nada para voce. ");
  }
 }
  private static void initializeInventory(Inventory inventory){
	//Adiciona guitarras ao estoque...
	inventory.addGuitar("V95693",
	1499.95, "Fender", "Stratocastor",
	"eletric", "Alder", "Alder");
  }
}