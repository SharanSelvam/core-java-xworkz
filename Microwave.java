class Microwave{
static String name="samsung";
static int minTime=10;
static int currentTime=30;
static int maxTime=60;
static boolean isPowered;

    public static boolean onoroff(){
	//System.out.println("Invoking onOrOff()");
	 //System.out.println("Parameter"+0);
	 if(isPowered==false){
	    isPowered=true;
		System.out.println("Microwave is turn onn.....food is ready");
		}
		else if(isPowered==true){
		isPowered=false;
		System.out.println("Microwave is turn off....food is late");
		}
	 return isPowered;
	 }
	 
	 public static void increaseTime(){
	if (isPowered==true){
			 if(currentTime<maxTime){
				 currentTime=currentTime+1;
				 System.out.println("The Current Time is"+currentTime);
			 }else{
				 System.out.println("Max Time Reached");
		 }}else{
				 System.out.println("Turn on the Microwave");
			 }	 
	 }
	 
	 public static void decreaseTime(){
		 if (isPowered==true){
			 if(currentTime>minTime){
				 currentTime=currentTime-1;
				 System.out.println("The Current Time is"+currentTime);
				 
			 }else {
				 System.out.println("Min Time Reached"+currentTime);
				 
			 }}else {
				 System.out.println("Turn on the Microwave");
			 }
		 }
	 }
	
