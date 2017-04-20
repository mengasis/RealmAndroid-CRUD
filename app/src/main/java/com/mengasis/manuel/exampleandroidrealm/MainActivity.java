package com.mengasis.manuel.exampleandroidrealm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mengasis.manuel.exampleandroidrealm.Models.Hero;
import com.mengasis.manuel.exampleandroidrealm.Services.HeroService;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.internal.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("Hero_Database")
                .schemaVersion(1)
                .build();

        Realm.setDefaultConfiguration(realmConfiguration);

        HeroService heroService = new HeroService(Realm.getDefaultInstance());

        heroService.createHero("Nightwing");

        Hero[] heroes = heroService.getHeroes();

        for (int i=0; i < heroes.length; i++){
            Log.d("Hero: ", "ID: " + heroes[i].getId() + " - Name: " + heroes[i].getName());
        }

    }

}
