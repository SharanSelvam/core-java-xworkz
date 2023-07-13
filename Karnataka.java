class Karnataka{
static String cityName[]={null,null,null,null,null,null};
static int index=0;
public static boolean addCity(String city){
boolean isAdded=false;
if(index<cityName.length){
if(cityName!=null){
cityName[index]=city;
index++;

isAdded=true;
}else{
System.out.println("cannot add city name");
}}else{
	System.out.println("City name is full .Cannot be added more ");
}
return isAdded;
}
public static void getCity(){
	//int i=0;
for(String name:cityName){
String references=name;
System.out.println(references);
//System.out.println("position of city "+i);
//i++;

}

}
public static boolean updateCityName(String existingCityName,String updatedCityName){
boolean isUpdated=false;
for(int cityIndex=0;cityIndex<cityName.length;cityIndex++){
	if(cityName[cityIndex].equals(existingCityName)){
		cityName[cityIndex]=updatedCityName;
		isUpdated=true;
	}
}
System.out.println("update city name is"+updatedCityName);
return isUpdated;	
}
	
}