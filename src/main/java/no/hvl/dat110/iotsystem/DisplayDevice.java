package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {

    private static final int COUNT = 10;

    public static void main(String[] args) {

        System.out.println("Display starting ...");

        Client broker = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
        broker.connect();
        broker.createTopic(Common.TEMPTOPIC);
        broker.subscribe(Common.TEMPTOPIC);

        Message message = broker.receive();
        System.out.println(message.toString());

        broker.unsubscribe(Common.TEMPTOPIC);
        broker.disconnect();

        System.out.println("Display stopping ... ");
    }
}
