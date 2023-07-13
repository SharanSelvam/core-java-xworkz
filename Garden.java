class Garden{
static String flowerName[]={null,null,null,null};
static int index=0;
public static boolean addFlower(String flower){
boolean isFlower=false;
if(flower!=null){
flowerName[index]=flower;
index++;
isFlower=true;
}else{
System.out.println("Cannot add flower");
}
return isFlower;
}
public static void getFlower(){
for(String name:flowerName){
String references=name;
System.out.println(references);
}
}
public static boolean updateFlowerName(String existingFlowerName,String updatedFlowerName){
boolean isUpdated=false;
for(int flowerIndex=0;flowerIndex<flowerName.length;flowerIndex++){
	if(flowerName[flowerIndex].equals(existingFlowerName)){
		flowerName[flowerIndex]=updatedFlowerName;
		isUpdated=true;
	}
}
System.out.println("Updated flower name is"+updatedFlowerName);
return isUpdated;
}
}