package adarchitecture.ada.org.adacontact.Helpers.RestHelper;

import com.android.volley.VolleyError;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by user on 26-11-2017.
 */

public interface OnVollyJsonObjectResponse {
    void onJsonObjectSuccess(JSONObject response);
    void onJsonObjectError(VolleyError error);
}
