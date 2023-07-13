class Ac{
static String name="LG";
static int minTemperature=18;
static int currentTemperature=22;
static int maxTemperature=26;
static boolean isPowered;

    public static boolean onoroff(){
	//System.out.println("Invoking onOrOff()");
	 //System.out.println("Parameter"+0);
	 if(isPowered==false){
	    isPowered=true;
		System.out.println("Ac is turn onn.....chill chill cool");
		}
		else if(isPowered==true){
		isPowered=false;
		System.out.println("Ac is turn off....very hot");
		}
	 return isPowered;
	 }
	 
	 public static void increaseTemperature(){
	if (isPowered==true){
			 if(currentTemperature<maxTemperature){
				 currentTemperature=currentTemperature+1;
				 System.out.println("The Current Temperature is"+currentTemperature);
			 }else{
				 System.out.println("Max Temperature Reached");
		 }}else{
				 System.out.println("Turn on the Ac");
			 }	 
	 }
	 
	 public static void decreaseTemperature(){
		 if (isPowered==true){
			 if(currentTemperature>minTemperature){
				 currentTemperature=currentTemperature-1;
				 System.out.println("The Current Temperature is"+currentTemperature);
				 
			 }else {
				 System.out.println("Min Temperature Reached"+currentTemperature);
				 
			 }}else {
				 System.out.println("Turn on the Ac");
			 }
		 }
	 }
	
