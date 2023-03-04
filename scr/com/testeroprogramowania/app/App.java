package com.testeroprogramowania.app;

import com.testeroprogramowania.app.database.DatabaseConnection;
import com.testeroprogramowania.app.database.DatabaseUtils;

public class App {
    public static void main(String[] args) {
        DatabaseConnection database = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
    }
}
