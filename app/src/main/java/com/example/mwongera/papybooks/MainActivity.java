package com.example.mwongera.papybooks;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;

import barreto.simpleloginlibrary.api_login.FacebookSign;
import barreto.simpleloginlibrary.api_login.GoogleSign;

public class MainActivity extends AppCompatActivity implements GoogleSign.InfoLoginGoogleCallback, FacebookSign.InfoLoginFaceCallback {

        GoogleSign googleSign;
        FacebookSign facebookSign;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        googleSign = new GoogleSign(this, this);
            facebookSign = new FacebookSign(this,this); // before setContentView

            setContentView(R.layout.activity_main);

    }

        @Override
        protected void onActivityResult ( int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        googleSign.resultGoogleLogin(requestCode, resultCode, data);
    }

        @Override
        public void getInfoLoginGoogle (GoogleSignInAccount account){

    }

        @Override
        public void connectionFailedApiClient (ConnectionResult connectionResult){

    }

        @Override
        public void loginFailed () {

    }

    @Override
    public void getInfoFace(String id, String nome, String email, String foto) {

    }

    @Override
    public void cancelLoginFace() {

    }

    @Override
    public void erroLoginFace(FacebookException e) {

    }
}