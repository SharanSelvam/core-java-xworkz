class Telecom{
static String simName[]={null,null,null,null,null};
static int index=0;
public static boolean addSim(String sim){
boolean isSim=false;
if(sim!=null){
simName[index]=sim;
index++;
isSim=true;
}else{
System.out.println("cannot add sim name");
}
return isSim;
}
public static void getSim(){
for(String name:simName){
String references=name;
System.out.println(references);
}
}
public static boolean updateSimName(String existingSimName,String updatedSimName){
	boolean isUpdated=false;
	for(int simIndex=0;simIndex<simName.length;simIndex++){
		if(simName[simIndex].equals(existingSimName)){
			simName[simIndex]=updatedSimName;
			isUpdated=true;
		}
	}
	System.out.println("updated sim name is"+updatedSimName);
return isUpdated;	
}

}