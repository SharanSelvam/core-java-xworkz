class TelecomTester{
public static void main(String args[]){
Telecom.addSim("Airtel");
Telecom.addSim("Idea");
Telecom.addSim("VI");
Telecom.addSim("Aircel");
Telecom.addSim("BSNL");
Telecom.getSim();
Telecom.updateSimName("Airtel","Airtel 5g");
Telecom.getSim();
}
}