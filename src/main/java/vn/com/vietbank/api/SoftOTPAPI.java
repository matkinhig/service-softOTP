package vn.com.vietbank.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.oracle.javafx.jmx.json.JSONException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.com.vietbank.uitls.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SoftOTPAPI {

    @PostMapping(value = "/api/v1/softotp")
    public Map<String,Object> handler(@RequestBody String jString){
        JsonObject jObj = getNameOfFuntion(jString);
        String funcName =  "";
        Map<String, Object> resMap = new HashMap<>();
        if (ObjectUtils.isEmpty(jObj)){
            funcName = "Errors Read your request!";
        } else {
            funcName = jObj.get("Function").getAsString();
        }
        switch (funcName) {
            case "CreateNewContract" :
                resMap = new Gson().fromJson(jString, new TypeToken<HashMap<String, Object>>() {}.getType());
                break;
            case "CreateNewChallengeCode" :
                resMap = new Gson().fromJson(jString, new TypeToken<HashMap<String, Object>>() {}.getType());
                break;
            case "SignTransaction" :
                resMap = new Gson().fromJson(jString, new TypeToken<HashMap<String, Object>>() {}.getType());
                break;
            case "RenewDevice" :
                resMap = new Gson().fromJson(jString, new TypeToken<HashMap<String, Object>>() {}.getType());
                break;
            default:
                resMap.put("error", funcName);
                break;
        }
        return resMap;
    }

    private JsonObject getNameOfFuntion(String str) {
        try {
            Gson g = new Gson();
            JsonObject jObj = g.fromJson(str, JsonObject.class);
            return jObj;
        } catch (JSONException ex) {
            return null;
        }
    }
}
