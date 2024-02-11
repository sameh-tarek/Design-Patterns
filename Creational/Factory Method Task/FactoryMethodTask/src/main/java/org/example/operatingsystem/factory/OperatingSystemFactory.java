package org.example.operatingsystem.factory;

import org.example.operatingsystem.family.OperatingSystem;

public interface OperatingSystemFactory {
    OperatingSystem createOS(int osType);
}
