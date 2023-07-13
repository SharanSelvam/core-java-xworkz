class TravelAgencyTester{
public static void main(String args[]){
TravelAgency.addPlaces("Bangalore");
TravelAgency.addPlaces("Mumbai");
TravelAgency.addPlaces("Chennai");
TravelAgency.addPlaces("Goa");
TravelAgency.addPlaces("Kolkata");
TravelAgency.addPlaces("New Delhi");
TravelAgency.addPlaces("Punjab");
TravelAgency.addPlaces("Singapore");
TravelAgency.getPlaces();
TravelAgency.updateTouristPlace("Mumbai","Kerala");
TravelAgency.getPlaces();
}

}