import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BooksApiController {

    private final HashMap<String, BooksApiResult> result = new HashMap<>();
    private final List<String> jsonItems = new LinkedList<>();

    public void sendQuery(BooksApiTarget target) throws IOException {
        //TODO Get new key from Google api. (Read books api documentation)
        URL url = new URL("https://www.googleapis.com/books/v1/volumes?" + urlFormatter(target.getQuery()) + "&key=AIzaSyBjAkyaxbpSI114orqjMmXo5BFJKCwZ1LA");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        parseItems(content.substring(content.indexOf("["), content.lastIndexOf("]")));
        appendListGson();
    }

    public BooksApiResult findExactBook(String idAsKey){
        return result.get(idAsKey);
    }

    private String urlFormatter(String rawUrl){
        return rawUrl.replaceAll("/s|[^a-zA-Z0-9-._~:+=]", "+");
    }

    private void parseItems(String json){
        int counter = 0;
        int start = 0;
        int end;
        for (int i = 0; i < json.length(); i++){
            char c = json.charAt(i);
            if (c == '{'){
                if (counter == 0){
                    start = i;
                }
                counter += 1;
            }
            else if (c == '}'){
                counter -= 1;
                if (counter == 0){
                    end = i;
                    jsonItems.add(json.substring(start, end + 1));
                }
            }
        }
    }

    private void appendListGson(){
        Gson gson = new GsonBuilder().create();
        for (String item : jsonItems){
            BooksApiResult resultItem = gson.fromJson(item, BooksApiResult.class);
            result.put(resultItem.getId(), resultItem);
        }
    }

    public HashMap<String, BooksApiResult> getResult() {
        return result;
    }
}
