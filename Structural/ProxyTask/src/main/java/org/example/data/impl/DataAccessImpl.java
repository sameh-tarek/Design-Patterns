package org.example.data.impl;

import org.example.data.DataAccess;

public class DataAccessImpl implements DataAccess {
    private String data;

    public DataAccessImpl(String data) {
        this.data = data;
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching Sensitive Data: " + data);
    }
}
