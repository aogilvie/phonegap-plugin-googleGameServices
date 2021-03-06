package com.github.aogilvie.phonegap.plugin.googleGameService;

import android.view.View;

import com.google.example.games.basegameutils.BaseGameActivity;

public class GoogleGameService extends BaseGameActivity implements View.OnClickListener {

    @Override
    public void onSignInFailed() {
        // Sign-in failed
    }

    @Override
    public void onSignInSucceeded() {
        // Sign-in worked!
    }

    @Override
    public void onClick(View view) {
    	switch (view.getId()) {
            /*
            case R.id.button_sign_in:
                // Start the sign-in flow
                beginUserInitiatedSignIn();
                break;
            case R.id.button_sign_out:
                // Sign out.
                signOut();
                break;
            case R.id.button_win:

                break;
            */
        }
    }

    public void beginUserInitiatedSignIn() {
    	beginUserInitiatedSignIn();
    }
    
    public void unlockAchievement(String achievement) {
        if (getGamesClient().isConnected()) {
            // Unlock the achievement.
            getGamesClient().unlockAchievement(achievement);
        }
    }
}
