class Speaker{
static String name="JBL";
static int minVolume;
static int currentVolume;
static int maxVolume =7;
static boolean isConnected;
     
	 public static boolean onOrOff(){
	 //System.out.println("Invoking onOrOff()");
	 //System.out.println("Parameter"+0);
	 if(isConnected == false){
	       isConnected = true;
		   System.out.println("Speaker is turned onn......Enjoy");
		   }
		   else if(isConnected==true){
		   isConnected=false;
		   System.out.println("Speaker is turned offf...");
		   }
		  
		   return isConnected;
	 }
	 public static void increaseVolume(){
		 //System.out.println("Invoking increaseVolume()");
		 //System.out.println("The list of parameter"+2);
		 
		 if (isConnected==true){
			 if(currentVolume<maxVolume){
				 currentVolume=currentVolume+1;
				 System.out.println("The Current Volume is"+currentVolume);
			 }else{
				 System.out.println("Max Volume Reached");
		 }}else{
				 System.out.println("Turn on the speaker");
			 }
			 //System.out.println("End of increaseVolume");
		 
	 }
	 public static void decreaseVolume(){
		 if(isConnected==true){
			 if(currentVolume>minVolume){
				 currentVolume=currentVolume-1;
				 System.out.println("The Current Volume is"+currentVolume);
			 }
		 }
		 //System.out.println("End of decreaseVolume");
		 
	 }
}
