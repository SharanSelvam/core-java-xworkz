class MusicalInstrument{
	String instrumentName;
	double price;
	boolean isElectric;
	boolean inStock;

	MusicalInstrument(String in, double p, boolean isEl,boolean ins){
		instrumentName=in;
		price=p;
		isElectric=isEl;
		inStock=ins;
	}
	public static void printDetails(MusicalInstrument obj){
		System.out.println("Instrument Name: "+obj.instrumentName);
		System.out.println("Price:"+obj.price);
		System.out.println("Is Electric Instrument: "+obj.isElectric);
		System.out.println("In Stock:"+obj.inStock);
		System.out.println("");

	}
}