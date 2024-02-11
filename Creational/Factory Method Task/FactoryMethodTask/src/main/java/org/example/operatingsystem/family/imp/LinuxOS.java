package org.example.operatingsystem.family.imp;

import org.example.operatingsystem.family.OperatingSystem;

public class LinuxOS implements OperatingSystem {

    @Override
    public void boot() {
        System.out.println("Booting Linux OS");
    }
}
