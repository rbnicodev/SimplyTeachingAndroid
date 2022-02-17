package com.rbnico.simplyteachingandroid.db;

import android.annotation.SuppressLint;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


public class MongoUtility {
    private static MongoClient client;

    private MongoUtility(){}

    @SuppressLint("AuthLeak")
    public static MongoClient getClient() {
        if(client==null)
        {
            try {
                client = MongoClients.create("mongodb+srv://sarumurm:12341234@cluster0.jmtpo.mongodb.net:27017?retryWrites=true&w=majority");
            } catch (Exception ignored) {}
        }

        return client;
    }
}
