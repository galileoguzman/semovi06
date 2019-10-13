package com.galileoguzman.semovi06.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class NotificationsService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String token) {
        Log.d("onNewToken", "Refreshed token: " + token);
    }
}
