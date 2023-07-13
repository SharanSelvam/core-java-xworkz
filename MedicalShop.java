class MedicalShop{
static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int index=0;
public static boolean addMedicine(String medicine){
boolean isAdded=false;
if(medicine!=null){
medicineNames[index]=medicine;
index++;
isAdded=true;
}else{
System.out.println("cannot be add");
}
return isAdded;
}
public static void getMedicine(){
for(String name:medicineNames){
String references=name;
System.out.println(references);
}
}
public static boolean updateMedicineName(String existingMedicineName,String updatedMedicineName){
	boolean isUpdated=false;
	for(int medicineIndex=0;medicineIndex<medicineNames.length;medicineIndex++){
		if(medicineNames[medicineIndex]==(existingMedicineName)){
				medicineNames[medicineIndex]=updatedMedicineName;
				isUpdated=true;
		}
	}
	System.out.println("Updated Medicine name is"+updatedMedicineName);
	return isUpdated;
}
}
