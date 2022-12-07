package ua.edu.ucu.OOPMiddle.Parsers;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.SneakyThrows;
import org.json.JSONException;
import org.json.JSONObject;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BrandfetchParser extends Parser{
    @SneakyThrows
    @Override
    public void parseCompany(Company company) throws IOException, UnirestException, JSONException {
//        URL url = new URL("http://jsoup.org");
//        URL url = new URL("https://brandfetch.com/ucu.edu.ua");
//        URL url = new URL("https://ucu.edu.ua/");
//        Document page = Jsoup.parse(url, 1000000000);
//        System.out.println(page);
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("text/plain");
//        RequestBody body_ = RequestBody.create(mediaType, "");
//        Request request = new Request.Builder()
//                .url("https://api.brandfetch.io/v2/brands/brandfetch.com")
//                .header("Authorization", "Bearer d6FgEWLZdjrilBTpymacanGX6SvGrGFKMPmY3ZJsfMM=")
//                .method("GET", body_)
//                .build();
//        Response response = client.newCall(request).execute();
//        System.out.println(response);
        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.get("https://api.brandfetch.io/v2/brands/" + company.getDomain())
                .header("Authorization", "Bearer d6FgEWLZdjrilBTpymacanGX6SvGrGFKMPmY3ZJsfMM=")
                .asString();
//        System.out.println(response.getBody());
        JSONObject responseJson = new JSONObject(response.getBody());

        System.out.println(responseJson);

        Map<Object, String> map_for_links = new HashMap<>();
        for (int i = 0; i < responseJson.getJSONArray("links").length(); i++) {
            map_for_links.put(responseJson.getJSONArray("links").getJSONObject(i).getString("name"),
                    responseJson.getJSONArray("links").getJSONObject(i).getString("url"));
        }
        String facebook_ = "";
        String twitter_ = "";
        if (map_for_links.containsKey("facebook") && map_for_links.containsKey("twitter")){
            facebook_ = map_for_links.get("facebook");
            twitter_ = map_for_links.get("twitter");
        } else if (map_for_links.containsKey("facebook")) {
            facebook_ = map_for_links.get("facebook");
        }
        else if (map_for_links.containsKey("twitter")) {
            twitter_ = map_for_links.get("twitter");
        }

        if (Objects.equals(facebook_, "") && Objects.equals(twitter_, "")) {
            if (map_for_links.size() >= 2) {
                Object firstKey = map_for_links.keySet().toArray()[0];
                facebook_ = map_for_links.get(firstKey);
                Object secondKey = map_for_links.keySet().toArray()[1];
                twitter_ = map_for_links.get(secondKey);
            }
        }
        else if (Objects.equals(facebook_, "")) {
            for (Object elem: map_for_links.keySet().toArray()) {
                if (elem != "twitter") {
                    facebook_ = map_for_links.get(elem);
                    break;
                }
            }
        }
        else if (Objects.equals(twitter_, "")) {
            for (Object elem: map_for_links.keySet().toArray()) {
                if (elem != "facebook") {
                    twitter_ = map_for_links.get(elem);
                    break;
                }
            }
        }

// Finding logo and icon
        Map<Object, String> map_for_logo = new HashMap<>();
        for (int i = 0; i < responseJson.getJSONArray("logos").length(); i++) {
            map_for_logo.put(responseJson.getJSONArray("logos").getJSONObject(i)
                            .getString("type"),
                    responseJson.getJSONArray("logos").getJSONObject(i)
                            .getJSONArray("formats").getJSONObject(0).getString("src"));
        }
        String icon = map_for_logo.get("icon");
        String logo = map_for_logo.get("logo");

        System.out.println(facebook_);
        System.out.println(twitter_);
        System.out.println(icon);
        System.out.println(logo);

        this.facebook = facebook_;
        this.twitter = twitter_;
        this.logo = logo;
        this.icon = icon;

        fillFields(company);

//        String name = (String) responseJson.get("fonts");
    }
}


