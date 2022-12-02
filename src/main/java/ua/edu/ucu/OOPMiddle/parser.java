package ua.edu.ucu.OOPMiddle;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.IOException;

public class parser {
    public static void main(String[] args) throws IOException, UnirestException {
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
        HttpResponse<String> response = Unirest.get("https://api.brandfetch.io/v2/brands/ucu.edu.ua")
                .header("Authorization", "Bearer d6FgEWLZdjrilBTpymacanGX6SvGrGFKMPmY3ZJsfMM=")
                .asString();
//        System.out.println(response.getBody());

        JSONObject responseJson = new JSONObject(response.getBody());
        System.out.println(responseJson.get("logo"));

//        String name = (String) responseJson.get("fonts");
    }
}


