package org.SdaG1.service;

import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.SdaG1.model.IssData;
import org.SdaG1.model.PeopleInSpaceData;

import java.io.IOException;

public class JsonSerializerService {
    private final String ISS_DATA_URL = "http://api.open-notify.org/iss-now.json";
    private final String PEOPLE_DATA_URL = "http://api.open-notify.org/astros.json";

    private Gson gson;

    public JsonSerializerService() {
        this.gson = new Gson();
    }

    public Response getApiCallResponse(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);

        return call.execute();
    }

    public String jsonString(String url) throws Exception {
        return getApiCallResponse(url).body().string();
    }

    public IssData issData() throws Exception {
        return gson.fromJson(jsonString(ISS_DATA_URL), IssData.class);
    }

    public PeopleInSpaceData peopleData() throws Exception {
        return gson.fromJson(jsonString(PEOPLE_DATA_URL), PeopleInSpaceData.class);
    }
}
