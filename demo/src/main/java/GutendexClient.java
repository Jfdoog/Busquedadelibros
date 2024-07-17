import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import  com.google.gson.Gson;

import java.io.IOException;

public class GutendexClient {
        private static final String API_URL = "https://gutendex.com/books/";
        private final OkHttpClient httpClient = new OkHttpClient();
        private final Gson gson = new Gson();

        public GutendexResponse searchBooks(String query) throws IOException {
            String url = API_URL + "?search=" + query;
            Request request = new Request.Builder().url(url).build();
            try (Response response = httpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
                return gson.fromJson(response.body().charStream(), GutendexResponse.class);
            }
        }
    }

