package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {

    private static final int COUNT = 10;

    public static void main(String[] args) {

        // simulated / virtual temperature sensor
        TemperatureSensor sn = new TemperatureSensor();

        Client broker = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);
        broker.connect();
        broker.publish(Common.TEMPTOPIC, "" + sn.read());
        broker.disconnect();

        System.out.println("Temperature device stopping ... ");
    }
}
