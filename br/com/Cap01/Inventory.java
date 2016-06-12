/*
   Classe Inventário - Um Inventário é composto por uma lista de várias Guitarras.
*/
package br.com.Cap01;

import br.com.Cap01.Guitar;

public class Inventory {
 
 //Declarando Atributos de Inventário.
 private List guitars;
 
 //Classe Construtora
 public Inventory() {
 
 guitars = new LinkedList();

 }
 //Método AdicionaGuitarra
 public void addGuitar(String serialNumber, double price,
                       String builder, String model,
					   String type, String backWood, String topWood){
					    
						 Guitar guitar = new Guitar(serialNumber, price, builder,
						                            model, type, backWood, topWood);
						 
						 guitars.add(guitar);
					   }//fim do método AdicionaGuitarra
					   
 //Método PegaGuitarra
 public Guitar getGuitar(Guitar searchGuitar){
  for (Iterator i = guitars.iterator(); i.hasNext(); ){
   Guitar guitar = (Guitar)i.next();
    if (guitar.getSerialNumber().equals(serialNumber)){
      return guitar;
    }//fim do if	 
  }//fim do for
  return null;
 }//fim do método PegaGuitarra
 
 //Método Buscar
 public Guitar search(Guitar searchGuitar) {
  for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	Guitar guitar = (Guitar)i.next();
	//Ignora o número de série e o preço já que são exclusivos.
	String builder = searchGuitar.getBuilder();
	 if((builder != null) && (!builder.equals("")) &&
	   (!builder.equals(guitar.getBuilder())))
	   continue;
	 String model = searchGuitar.getModel();
	  if((model != null) && (!model.equals("")) &&
	   (!model.equals(guitar.getModel())))
	   continue;
	 String type = searchGuitar.getType();
	  if((type != null) && (!type.equals("")) &&
	   (!type.equals(guitar.getType())))
	   continue;
	 String backWood = searchGuitar.getBackWood();
	  if((backWood != null) && (!backWood.equals("")) &&
	   (!backWood.equals(guitar.getBackWood())))
	   continue;
	 String topWood = searchGuitar.getTopWood();
	  if((topWood != null) && (!topWood.equals("")) &&
	   (!topWood.equals(guitar.getTopWood())))
	   continue;
  }//fim do for.
  return null;
  }// fim do método Buscar
 } //fim da Classe inventário.