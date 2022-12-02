package ua.edu.ucu.OOPMiddle.Parsers;

import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.SneakyThrows;
import org.json.JSONException;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.io.IOException;

public interface ParserInterface {
    @SneakyThrows
    public void parseCompany(Company company) throws IOException, UnirestException, JSONException;
}
