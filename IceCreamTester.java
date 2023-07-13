class IceCreamTester{
public static void main(String args[]){
IceCream.addFlavour("Vanilla");
IceCream.addFlavour("Chocolate");
IceCream.addFlavour("Mango");
IceCream.addFlavour("Orange");
IceCream.addFlavour("Strawberry");
IceCream.addFlavour("Black Current");
IceCream.getFlavour();
System.out.println("UUpdating eelements");
IceCream.updateFlavourName("Vanilla","Choco Chip");
 IceCream.getFlavour();
 System.out.println("Deleting 1st elemts");
/* IceCream.deleteFlavourName("Mango");
 IceCream.getAllFlavourNamePostDeletion();
 System.out.println("Deleting 2nd elemts");
IceCream.deleteFlavourName("Chocolate");
 IceCream.getAllFlavourNamePostDeletion();*/
 IceCream.removeflavourName("Strawberry");
 String flavour=IceCream.searchFlavourByName("Mango");
 System.out.println("the searched flavour is"+flavour);

 
//IceCream.getFlavour();
 
 }
}