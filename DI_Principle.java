//************************************************************************
// Title : A java programme to demonstrate Dependency Inversion Principle.
// Author : Radhika Chowdhury, Undergrduate student, Khulna University.
//************************************************************************

import java.util.ArrayList;
import java.util.List;
/**
 * Interface representing a device.
 */
interface Device {
    /**
     * Method to turn on the device.
     */
    void turnOn();
    
    /**
     * Method to turn off the device.
     */
    void turnOff();
}

/**
 * Class representing a light bulb device.
 */
class LightBulb implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off.");
    }
}

/**
 * Class representing a fan device.
 */
class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off.");
    }
}

/**
 * Class representing a device manager.
 */
class DeviceManager {
    private Device device;

    /**
     * Constructor to initialize the device manager with a device.
     * @param device The device to be managed.
     */
    public DeviceManager(Device device) {
        this.device = device;
    }

    /**
     * Method to turn on the device.
     */
    public void turnOnDevice() {
        device.turnOn();
    }

    /**
     * Method to turn off the device.
     */
    public void turnOffDevice() {
        device.turnOff();
    }
}

/**
 * Main class to demonstrate Dependency Inversion Principle.
 */
public class Dependency_inversion_Principle {
    public static void main(String[] args) {
        // Creating a light bulb device
        Device lightBulb = new LightBulb();

        // Creating a fan device
        Device fan = new Fan();

        // Creating device managers for the light bulb and fan
        DeviceManager lightBulbManager = new DeviceManager(lightBulb);
        DeviceManager fanManager = new DeviceManager(fan);

        // Turning on and off the light bulb
        lightBulbManager.turnOnDevice();
        lightBulbManager.turnOffDevice();

        // Turning on and off the fan
        fanManager.turnOnDevice();
        fanManager.turnOffDevice();
    }
}
//We have an interface Device representing a device with methods turnOn() and turnOff().
//LightBulb and Fan are concrete implementations of the Device interface, 
//DeviceManager is a high-level module that depends on the Device abstraction rather than on specific implementations. 
//It takes a Device as a dependency in its constructor.
//The DeviceManager class manages the turning on and off of the device using the configured device, 
//following the Dependency Inversion Principle 
//by depending on abstractions (Device) rather than concrete implementations.
//This design allows us to easily switch between different types of devices without modifying the DeviceManager class, 
//demonstrating the flexibility and extensibility provided by the Dependency Inversion Principle.
