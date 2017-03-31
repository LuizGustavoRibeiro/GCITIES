package com.example.luizgustavo.login;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by LuizGustavo on 22/03/2017.
 */

public class LoginApp extends Application {
  protected void onCreat(){
    super.onCreate();
    AppEventsLogger.activateApp(this);
  }
}
