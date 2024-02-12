package org.example.operatingsystem.factory.impl;

import org.example.operatingsystem.factory.OperatingSystemFactory;
import org.example.operatingsystem.family.OperatingSystem;
import org.example.operatingsystem.family.imp.AndroidOS;
import org.example.operatingsystem.family.imp.LinuxOS;
import org.example.operatingsystem.family.imp.WindowsOS;

public class OperatingSystemFactoryImpl implements OperatingSystemFactory {
    private final int WINDOWS = 1;
    private final int LINUX = 2;
    private final int ANDROID = 3;
    @Override
    public OperatingSystem createOS(int osType) {
        switch (osType){
            case WINDOWS:
                return new WindowsOS();
            case LINUX:
                return new LinuxOS();
            case ANDROID:
                return new AndroidOS();
            default:
                throw new IllegalArgumentException("Invalid OS type: " + osType);
        }
    }
}
