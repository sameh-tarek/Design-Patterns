package org.example.operatingsystem.family.imp;

import org.example.operatingsystem.family.OperatingSystem;

public class WindowsOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Booting Windows OS");
    }
}
