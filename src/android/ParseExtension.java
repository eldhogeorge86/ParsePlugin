package com.conzole.parseplugin;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseUser;
import com.parse.ParseException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ParseExtension extends CordovaPlugin {

	private final String TAG = "ParseExtension";
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		
		try {
			Log.d(TAG, "action:" + action);
			cordova.setActivityResultCallback(this);
			
			if (action.equals("initialize")) {
				Parse.initialize(cordova.getActivity(), "KtEEaus447TpIR7NTGJVQs3Oj982qM2Ccz8oEhke",
						"5tAzG9eU6r1xrUiarLyrw9CbDH8hIZDj9JEqNx0u");
		        
		        ParseFacebookUtils.initialize("1459231424341380");
		        
		        callbackContext.success();
		        return true;
			}
			callbackContext.error("Invalid action");
		    return false;
		} catch(Exception e) {
			Log.d(TAG, "Exception: " + e.getMessage());
		    callbackContext.error(e.getMessage());
		    return false;
		} 
		
	}

	
}