class MalabarChai{
 /*static String location="Malleshwaram";
 static String tea="Masala Tea";
 static String tea1="Ginger Tea";
 static String tea2="Lemon Tea";
 static String tea3="Elaichi Tea";
 static String tea4="Bombay Cutting Tea";
 static String tea5="Black Tea";
 static String tea6="Sulaimani Tea";
 static String tea7="Tulsi Tea";
 static String tea8="Herbal Tea";
 static String tea9="Tea";
 static String tea10="Green Tea";*/
 
 static String chaiAvailable[]={null,null,null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addChai(String chai){
	 boolean isAdded=false;
	 if(chai!=null){
		 
	  chaiAvailable[index]=chai;
      index++;
      isAdded=true;	  
	 } else{
		 System.out.println("cannot add chai,as it is a null value");
	 }
	 return isAdded;
	 }
 public static void getMalabarChai(){
 for(String chai:chaiAvailable){
 String reference=chai;
 System.out.println(reference);
 
 }
 
}
 }