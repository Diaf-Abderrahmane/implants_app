package com.implants.demo.service;

import com.implants.demo.model.Device;
import com.implants.demo.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Optional<Device> getDeviceById(String id) {
        return deviceRepository.findById(id);
    }

    public Device createDevice(Device device) {
        // Ensure displayName is always "Implant Cochleaire"
        device.setDisplayName("Implant Cochleaire");
        return deviceRepository.save(device);
    }

    public void deleteDevice(String id) {
        deviceRepository.deleteById(id);
    }
}
