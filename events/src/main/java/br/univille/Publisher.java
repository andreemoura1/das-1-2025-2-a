package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Publisher {
    public static void main(String[] args) {
        var server = "sbdas12025a.servicebus.windows.net";
        var topic = "topic-das1-a";

        // DefaultAzureCredential = credential = new
        // DefaultAzureCredentialBuilder().build();

        String chave = System.getenv("CHAVE");

        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(server)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                // .credential(credential)
                .connectionString(chave)
                .sender()
                .topicName(topic)
                .buildClient();

        senderClient.sendMessage(
                new ServiceBusMessage("Ian: Bom dia!"));
    }
}
