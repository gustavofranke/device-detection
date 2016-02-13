package com.example.service;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DevicePlatform;

public class DeviceService implements Device {
    @Override
    public boolean isNormal() {
        return false;
    }

    @Override
    public boolean isMobile() {
        return false;
    }

    @Override
    public boolean isTablet() {
        return false;
    }

    @Override
    public DevicePlatform getDevicePlatform() {
        return null;
    }
}