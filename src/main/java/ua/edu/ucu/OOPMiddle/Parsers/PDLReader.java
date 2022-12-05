package ua.edu.ucu.OOPMiddle.Parsers;

import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.SneakyThrows;
import org.json.JSONException;
import org.json.JSONObject;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PDLReader extends Parser{
    @SneakyThrows
    @Override
    public void parseCompany(Company company) throws IOException, UnirestException, JSONException {
        String API_KEY = "a8edbab5a442900ff41d6e5cafe8c08ec4b967b8865483c5e478434ac029cd23";
        String query = URLEncoder.encode("SELECT NAME FROM COMPANY WHERE WEBSITE='" + company.getDomain() + "'", StandardCharsets.UTF_8);
        URL url = new URL("https://api.peopledatalabs.com/v5/company/search?sql=" + query);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        System.out.println(jsonObject);
        this.name = jsonObject.getJSONArray("data").getJSONObject(0).getString("name");
        this.employees = String.valueOf(jsonObject.getJSONArray("data").getJSONObject(0).getInt("employee_count"));
        fillFields(company);
    }
}
