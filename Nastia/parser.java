package ua.edu.ucu.OOPMiddle;
import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.util.HashMap;


public class parser {
    public static void main(String[] args) throws UnirestException {
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = (HttpResponse<String>) Unirest.get("https://api.brandfetch.io/v2/brands/ucu.edu.ua")
                .header("Authorization", "Bearer d6FgEWLZdjrilBTpymacanGX6SvGrGFKMPmY3ZJsfMM=")
                .asString();
        JSONObject responseJson = new JSONObject(response.getBody());
        System.out.println(responseJson);
        HashMap<String, String> links = new HashMap<>();
        System.out.println(responseJson.get("links"));
        var image = responseJson.get("links");
        for(int i = 0;  i <responseJson.getJSONArray("links").length(); i ++ ){
            links.put(responseJson.getJSONArray("links").getJSONObject(i).get("name").toString(), responseJson.getJSONArray("links").getJSONObject(i).get("url").toString());
        }
        var logo = responseJson.getJSONArray("logos").getJSONObject(0).getJSONArray("formats").getJSONObject(0).get("src");
        var icon = responseJson.getJSONArray("logos").getJSONObject(1).getJSONArray("formats").getJSONObject(0).get("src");
    }
    }
