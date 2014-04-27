package com.github.aogilvie.phonegap.plugin.googleGameService;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.google.android.gms.common.GooglePlayServicesUtil;

/**
 * 
 * @author Ally Ogilvie
 * @copyright 2014
 * @file googleGameServicesPlugin for Cordova
 * @about Handle JavaScript API calls from PhoneGap to googleGameServices
 *
 */
public class GoogleGameServicePlugin extends CordovaPlugin {

	private String TAG = "GoogleGameServicesPlugin";
    private GoogleGameService googleGameServices;

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        // Check for compatible Google Play services APK
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.cordova.getActivity()) != 0) {
            // Google Play Services is missing, return error
            Log.e(TAG, "Google Play Services are unavailable");
            callbackContext.error(GGSError.UNAVAILABLE);
            return true;
        } else {
        	Log.d(TAG, "** Google Play Services are available **");
        }

        if (googleGameServices == null) {
            googleGameServices = new GoogleGameService();
        }

		if (action.equals("authenticate")) {
			googleGameServices.beginUserInitiatedSignIn();
			return true;
		} else if (action.equals("showLeaderboard")) {

			return true;
		} else if (action.equals("reportAchievement")) {

            return true;
        } else if (action.equals("showAchievements")) {
            googleGameServices.unlockAchievement(args.getString(0));
            return true;
        }

        return false;
	}
}

// A simple static error handler, prevent us messing up string names manually
final class GGSError {
	// When Google Play is not installed on device return this error
	public static String UNAVAILABLE = "UNAVAILABLE";
}
