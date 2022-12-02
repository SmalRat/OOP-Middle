package ua.edu.ucu.OOPMiddle.Parsers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.PlaceDetailsRequest;
import com.google.maps.TextSearchRequest;
import com.google.maps.model.PlaceDetails;
import com.google.maps.model.PlacesSearchResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.SneakyThrows;
import org.json.JSONException;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.io.IOException;

public class GooglePlaces extends Parser{
    @SneakyThrows
    @Override
    public void parseCompany(Company company) throws IOException, UnirestException, JSONException {
        String API_KEY = "AIzaSyAH4V2nQw2wOHEMrYgJl0gNeuTGtHhouKE";
        String query = "ucu.edu.ua";
        GeoApiContext context = new GeoApiContext.Builder()
                .apiKey(API_KEY)
                .build();
        PlacesSearchResponse placesRespose = new TextSearchRequest(context).query(query).await();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        this.address = placesRespose.results[0].formattedAddress;
        String placeId = placesRespose.results[0].placeId;

        PlaceDetails placeDetails = new PlaceDetailsRequest(context).placeId(placeId).await();
        //System.out.println(gson.toJson(placeDetails));
        System.out.format("Place ID %s\n",  placeId);
        System.out.format("Address %s\n",  address);


        context.shutdown();
        fillFields(company);
    }
}
