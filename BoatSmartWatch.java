class BoatSmartWatch{
 static String brandName;
  static String displayType;
  static String materialType;
  static String bandColour;
  static String operatingSystem;
  static String controller;
  static String weight;
  static long price;
  \\illegal start expression because we using both static 
  public static void main(String args[]){
	   static String brandName="Boat Xtend";
  static String displayType="HD";
  static String materialType="Silicone";
  static String bandColour="Black";
  static String operatingSystem="IOS,ANDROID";
  static String controller="Touch Control";
  static String weight="45grams";
  static long price=1500l;
  
  System.out.println("Main Started");
  System.out.println("BrandName is "+brandName);
  System.out.println("Display Type is "+displayType);
  System.out.println("MaterialType is "+materialType);
  System.out.println("Colour of band is "+bandColour);
  System.out.println("Operating System is "+operatingSystem);
  System.out.println("Controller is "+controller);
  System.out.println("Weight is "+weight);
  System.out.println("price is "+price);
  System.out.println("Main Ended");
}

}