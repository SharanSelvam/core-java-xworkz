class Television{
static String name="sony";
static int minChannel=1;
static int currentChannel=50;
static int maxChannel=99;
static boolean isPowered;
   public static boolean onoroff(){
   if(isPowered==false){
      isPowered=true;
	  System.out.println("Turn on the Tv");
	  }
	  else if(isPowered==true){
	           isPowered=false;
			   System.out.println("Turn on the Tv");
			   }
			   return isPowered;
			}
			
			public static void increaseChannel(){
			if(isPowered=true){
			 if(currentChannel<maxChannel){
			 currentChannel=currentChannel+1;
			 System.out.println("Current Channel is"+currentChannel);
			 }else{
			 System.out.println("Max Speed Reached");
			 }}else{
			 System.out.println("Turn on the Tv");}
			 
			}
			public static void decreaseChannel(){
			if(isPowered=true){
			 if(currentChannel>minChannel){
			 currentChannel=currentChannel-1;
			 System.out.println("Current Channel is"+currentChannel);
			 }else{
			 System.out.println("Min Speed Reached");
			 }}else{
			 System.out.println("Turn on the Tv");}
			 
			}
			
			
			}


