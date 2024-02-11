package org.example.operatingsystem.family.imp;

import org.example.operatingsystem.family.OperatingSystem;

public class AndroidOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Android OS");
    }
}
