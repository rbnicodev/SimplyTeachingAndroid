package com.rbnico.simplyteachingandroid.db;

import android.annotation.SuppressLint;

import com.mongodb.MongoClient;

public class MongoUtility {
    private static MongoClient client;

    private MongoUtility(){}

    @SuppressLint("AuthLeak")
    public static MongoClient getClient() {
        if(client==null)
        {
            client = new MongoClient("mongodb+srv://sarumurm:12341234@cluster0.jmtpo.mongodb.net/myFirstDatabase?retryWrites=true&w=majority", 27017);
        }

        return client;
    }
}
