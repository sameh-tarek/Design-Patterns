package org.example.proxy;

import org.example.data.DataAccess;
import org.example.data.impl.DataAccessImpl;

public class ProxyDataAccess implements DataAccess{
    private String data;
    private String username;
    private DataAccess dataAccess;

    public ProxyDataAccess(String data, String username) {
        this.data = data;
        this.username = username;
    }

    @Override
    public void fetchData() {
        if(username.equals("Admin")){
            dataAccess = new DataAccessImpl(data);
            dataAccess.fetchData();
        }else {
            System.out.println("Access denied. Only admin can fetch sensitive data.");
        }
    }
}
