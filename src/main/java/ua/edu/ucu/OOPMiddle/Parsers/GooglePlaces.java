package ua.edu.ucu.OOPMiddle.Parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.PlaceDetailsRequest;
import com.google.maps.TextSearchRequest;
import com.google.maps.model.PlaceDetails;
import com.google.maps.model.PlacesSearchResponse;
import lombok.SneakyThrows;

public class GooglePlaces implements {
    @SneakyThrows
    public static void main(String[] args) {
        String API_KEY = "AIzaSyAH4V2nQw2wOHEMrYgJl0gNeuTGtHhouKE";
        String query = "ucu.edu.ua";
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();
        PlacesSearchResponse placesRespose = new TextSearchRequest(context).query(query).await();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String address = placesRespose.results[0].formattedAddress;
        String placeId = placesRespose.results[0].placeId;

        PlaceDetails placeDetails = new PlaceDetailsRequest(context).placeId(placeId).await();
        //System.out.println(gson.toJson(placeDetails));
        System.out.format("Place ID %s\n",  placeId);
        System.out.format("Address %s\n",  address);

        context.shutdown();

    }
}
