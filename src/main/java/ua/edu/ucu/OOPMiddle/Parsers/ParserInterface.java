package ua.edu.ucu.OOPMiddle.Parsers;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.io.IOException;

public interface ParserInterface {
    public Company parseCompany(Company company) throws IOException, UnirestException, JSONException;
}
