package br.com.Cap01;

import br.com.Cap01.Guitar;
import br.com.Cap01.Inventory;

public class FindGuitarTester {
 public static void main(String args[] ){
  Inventory inventory = new Inventory();
  initializeInventory(inventory);
  
  Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor"
                                   "electric", "Alder", "Alder");
  Guitar guitar = inventory.search(whatErinLikes);
  if (guitar != null) {
   System.out.println("Erin, talvez você goste desta " +
    guitar.getBuilder() + " " + guitar.getModel() + " "
	guitar.getType() + "guitar:\n " +
	guitar.getBackWood() +" na traseira e laterais, \n " +
	guitar.getTopWood() + "no tampo.\nEla pode ser sua por apenas US$" +
	guitar.getPrice() + "!");
  }else{
   System.out.println("Desculpe, Erin, não temos nada para você. ");
  }
 }
  private static void initializeInventory(Inventory inventory){
	//Adiciona guitarras ao estoque...
  }
}