import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Inventory{
	
	//criando uma lista de objetos do tipo Guitarra.
	private List guitars;
	
	//No método construtor da classe, é atribuido a lista guitars, uma LinkedList
	public Inventory(){
		guitars = new LinkedList();
	}
	
	//método que adiciona uma guitarra na lista.
	public void addGuitar(String serialNumber,double price,
						  String builder, String model,
						  String type, String backWood, String topWood){
						  
								Guitar guitar = new Guitar(serialNumber, price, builder,
															model, type, backWood, topWood);							
								guitars.add(guitar);
	}//fim do método addGuitar
	
    //método que busca uma guitarra através do seu número de série.	
	public Guitar getGuitar(String serialNumber){
					      
						  for(Iterator i = guitars.iterator(); i.hasNext(); ){
						  Guitar guitar = (Guitar)i.next();
						  
							if (guitar.getSerialNumber().equals(serialNumber)){
								return guitar;
							}
						  }
						return null;
	}//fim do método getGuitar
	
	//Método search que pesquisa uma guitarra na LinkedList guitars.
	public Guitar search(Guitar searchGuitar){
	 for (Iterator i = guitars.iterator(); i.hasNext(); ){
	 Guitar guitar = (Guitar)i.next();
	 
	 // Ignora o número de série, já que ele é exclusivo
	 // Ignora o preço, já que ele é exclusivo.
	 
	 String builder = searchGuitar.getBuilder();
	  if((builder != null) && (!builder.equals("")) &&
	    (!builder.equals(guitar.getBuilder())))
		continue;
	 
	 String model = searchGuitar.getModel();
		if ((model != null) && (!model.equals("")) &&
		(!model.equals(guitar.getModel())))
		continue;
	 
	 String type = searchGuitar.getType();
		if ((type != null) && (!type.equals("")) &&
		(!type.equals(guitar.getType())))
		continue;
	 
	 String backWood = searchGuitar.getBackWood();
		if ((backWood != null) && (!backWood.equals("")) &&
		(!backWood.equals(guitar.getBackWood())))
		continue;
	 
	 String topWood = searchGuitar.getTopWood();
		if((backWood != null) && (!backWood.equals("")) &&
		(!backWood.equals(guitar.getBackWood())))
		continue;
	 
	 }
	 return null;
	} // fim do método search
}