package jp.wizcorp.phonegap.plugin.googleGameServices;

import android.R;
import android.util.Log;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.google.android.gms.common.GooglePlayServicesUtil;

/**
 * 
 * @author WizCorp Inc. [ Incorporated Wizards ] 
 * @copyright 2013
 * @file googleGameServicesPlugin for Cordova
 * @about Handle JavaScript API calls from PhoneGap to googleGameServices
 *
 */
public class GoogleGameServicesPlugin extends CordovaPlugin {

	private String TAG = "GoogleGameServicesPlugin";

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        // Check for compatible Google Play services APK
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.cordova.getActivity()) != 0) {
            // Google Play Services not available, return error
            Log.e(TAG, "Google Play Services are unavailable");
            callbackContext.error("Google Play Services are unavailable");
            return true;
        }

		if (action.equals("test")) {
			// create spinner with options
			// Not supported in Android
            Log.d(TAG, "test");
			callbackContext.success();
			return true;
		} else if (action.equals("show")) {
			// Show spinner with options
			Log.i(TAG, "[SHOW SPINNER] ******* ");
			// WizSpinner.show(cordova.getActivity(), args);
			// callbackContext.success();
			return true;
		} else if (action.equals("hide")) {
			// Hide spinner with options
			Log.i(TAG, "[HIDE SPINNER] ******* ");
			// WizSpinner.hide(cordova.getActivity());
			// callbackContext.success();
			return true;
		} 
		
		return false;
	}
	
}
