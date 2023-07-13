class TravelAgency{
static String touristPlaces[]={null,null,null,null,null,null,null,null};
static int index=0;
public static boolean addPlaces(String places){
boolean isPlaces=false;
if(places!=null){
touristPlaces[index]=places;
index++;
isPlaces=true;
}else{
System.out.println("Cannot be add the places");
}
return isPlaces;
}
public static void getPlaces(){
for(String place:touristPlaces){
String references=place;
System.out.println(references);
}
}
public static boolean updateTouristPlace(String existingTouristPlace,String updatedTouristPlace){
	boolean isUpdated=false;
	for(int touristIndex=0;touristIndex<touristPlaces.length;touristIndex++){
		if(touristPlaces[touristIndex]==(existingTouristPlace)){
			touristPlaces[touristIndex]=updatedTouristPlace;
			isUpdated=true;
		}
	}
	System.out.println("Updated tourist place is"+updatedTouristPlace);
	return isUpdated;
}
}