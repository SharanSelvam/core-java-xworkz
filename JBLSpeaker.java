class JBLSpeaker{
	 String speakerBrand="JBL";
	 String speakerName="Headphones";
	 boolean isBluetooth=false;
	 String batteryLife="wired";
//non-static variables
public static void main(String bro[])
{
   String configuration="Stereo";
   int powerOutput=14;
   int price=2899;
	System.out.println("The Speaker Brand is: "+speakerBrand);
	System.out.println("The Speaker Name is: "+speakerName);
	System.out.println("Wireless Speaker: "+isBluetooth);
	System.out.println("The battery life of the speaker is: "+batteryLife);
	System.out.println("The speaker Configuration is: "+configuration);
	System.out.println("The Price of the speaker is: Rs"+price);
	System.out.println("The Power Output of the Speaker is: "+powerOutput);
}
}