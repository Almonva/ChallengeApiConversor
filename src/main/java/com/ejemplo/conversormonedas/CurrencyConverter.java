package com.ejemplo.conversormonedas;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class CurrencyConverter {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";
    private OkHttpClient client;

    public CurrencyConverter() {
        this.client = new OkHttpClient();
    }

    public double convert(String fromCurrency, String toCurrency, double amount) throws IOException {
        String url = API_URL + fromCurrency;
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();

        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();
        double exchangeRate = jsonObject.getAsJsonObject("rates").get(toCurrency).getAsDouble();
        return amount * exchangeRate;
    }
}
