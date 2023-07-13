class IceCream{
static String flavourName[]={null,null,null,null,null,null};
static int index;
public static boolean addFlavour(String flavour){
boolean isAdded=false;
if(flavour!=null){
flavourName[index]=flavour;
index++;
isAdded=true;
}else{
System.out.println("Cannot be added");
}
return isAdded;
}
public static void getFlavour(){
for(String name:flavourName){
String references=name;
System.out.println(references);
}
}
public static boolean updateFlavourName(String existingFlavourName,String updatedFlavourName){
	boolean isUpdated=false;
	for(int flavourIndex=0;flavourIndex<flavourName.length;flavourIndex++){
		if(flavourName[flavourIndex].equals(existingFlavourName)){
			flavourName[flavourIndex]=updatedFlavourName;
			isUpdated=true;
		}
	}
	System.out.println("Updated flavour name is"+updatedFlavourName);
	return isUpdated;
}
public static void deleteFlavourName(String deletedFlavourName){
	boolean isDeleted=false;
	int flavourIndex;
	int noOfElements=flavourName.length;
	for(flavourIndex=0;flavourIndex<flavourName.length;flavourIndex++){
		if(flavourName[flavourIndex]==deletedFlavourName){
			break;	
		}
	}
	if(flavourIndex<=noOfElements){
		noOfElements=noOfElements-1;
		for(int newflavourIndex=flavourIndex;newflavourIndex<noOfElements;newflavourIndex++){
			flavourName[newflavourIndex]=flavourName[newflavourIndex+1];
		}
	}
	//return noOfElements;
}
public static void getAllFlavourNamePostDeletion(){
	int noOfElements=flavourName.length-1;
	for(int flavourIndex=0;flavourIndex<noOfElements;flavourIndex++){
		System.out.println(flavourName[flavourIndex]);
	}
}
public static void removeflavourName(String removedflavourName){
	for( int i=0;i<flavourName.length;i++){
		if(removedflavourName==flavourName[i]){
			for(int j=i;j<flavourName.length-1;j++){
				flavourName[j]=flavourName[j+1];
			}
		break;
		}
		
	}
	for(int i=0;i<flavourName.length-1;i++){
		System.out.println("the element are"+flavourName[i]);
	}
}

public static String searchFlavourByName(String itemName){
	String sName=null;
	for(String name:flavourName){
		
		//Chocolate.equals("Chocolate")
		if(name.equals(itemName)){
			sName=name;
			System.out.println("item name found");
			return sName;
		}
	}
	if(sName==null){
		System.out.println("element not found");
		
	}
	return sName;
}
}

