class Mixer{
static String name="sony";
static int minSpeed=0;
static int currentSpeed=2;
static int maxSpeed=4;
static boolean isPowered;
   public static boolean onoroff(){
   if(isPowered==false){
      isPowered=true;
	  System.out.println("Turn on the mixer");
	  }
	  else if(isPowered==true){
	           isPowered=false;
			   System.out.println("Turn on the mixer");
			   }
			   return isPowered;
			}
			
			public static void increaseSpeed(){
			if(isPowered=true){
			 if(currentSpeed<maxSpeed){
			 currentSpeed=currentSpeed+1;
			 System.out.println("Current Speed is"+currentSpeed);
			 }else{
			 System.out.println("Max Speed Reached");
			 }}else{
			 System.out.println("Turn on the mixer");}
			 
			}
			public static void decreaseSpeed(){
			if(isPowered=true){
			 if(currentSpeed>minSpeed){
			 currentSpeed=currentSpeed-1;
			 System.out.println("Current Speed is"+currentSpeed);
			 }else{
			 System.out.println("Min Speed Reached");
			 }}else{
			 System.out.println("Turn on the mixer");}
			 
			}
			
			
			}


