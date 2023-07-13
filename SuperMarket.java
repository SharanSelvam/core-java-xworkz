class SuperMarket {
  static String vegatables[]={"Onion","Beans","Brinjal","Tomato","Carrot"} ; 
  static String biscuits[]={"Oreo","Parle G","Marie Gold","Hide & Seek","50-50","Tiger","Bourbon","Milk Bikies","Gooday","Moms Magic"};
  static String perfumes[]={"Axe","Fogg","CK","KS","Nike","Brut","Villian","Wild Stone","Puma","One8"};
  static String grocerys[]={"Rice","Wheat","Flour","Butter","Oil","Dal","Seeds","Eggs","Ragi","Maggie"};
public static void main(String args[]){
System.out.println("Main Started");
        System.out.println("LIST OF VEGATABLES ARE : ");
        getVegatables();
		System.out.println("LIST OF BISCUITS ARE :");
		getBiscuits();
		System.out.println("LIST OF PERFUMES ARE :");
		getPerfumes();
				System.out.println("LIST OF GROCERYS ARE :");
				getGrocerys();


System.out.println("Main Ended");
}  
     public static void getVegatables(){
		 System.out.println("Inside getVegatables");
		 for(String vegatable:vegatables ){
			 System.out.println(vegatable);
		 }
	 }
      
      public static void getBiscuits(){
		  System.out.println("Inside getBiscuits");
		  for(String biscuit:biscuits){
			  System.out.println(biscuit);
		  }
	  }	  
       
	   public static void getPerfumes(){
		   System.out.println("Inside getPerfumes");
		   for(String perfume:perfumes){
			   System.out.println(perfume);
		   }
	   }
	   
	   public static void getGrocerys(){
		   System.out.println("Inside getGrocery");
		   for(String grocery:grocerys){
			   System.out.println(grocery);
		   }
	   }

   
}