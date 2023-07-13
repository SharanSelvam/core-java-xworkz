class Metro{
static String stationName[]={null,null,null,null,null,null,null};
static int index=0;
public static boolean enterStation(String station){
boolean isStation=false;
if(station!=null){
stationName[index]=station;
index++;
isStation=true;
}else{
System.out.println("Cannot add the Station");
}
return isStation;
}
public static void getStation(){
for(String name:stationName){
String references=name;
System.out.println(references);
}
}
public static boolean updateStationName(String existingStationName,String updatedStationName){
	boolean isUpdated=false;
	for(int stationIndex=0;stationIndex<stationName.length;stationIndex++){
		if(stationName[stationIndex].equals(existingStationName)){
			stationName[stationIndex]=updatedStationName;
			isUpdated=true;
			
		}
	}
	System.out.println("Updated Station name is"+updatedStationName);
	return isUpdated;
}
}