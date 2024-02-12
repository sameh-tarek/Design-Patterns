package org.example;

import org.example.data.DataAccess;
import org.example.proxy.ProxyDataAccess;

public class Main {
    public static void main(String[] args) {
        DataAccess authorizedAccess = new ProxyDataAccess("secret info", "Admin");
        authorizedAccess.fetchData();

        DataAccess unauthorizedAccess = new ProxyDataAccess("secret info", "user");
        unauthorizedAccess.fetchData();
    }
}