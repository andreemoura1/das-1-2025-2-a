package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Subscriber {
    public static void main(String[] args) {
        var servidor = "sbdas12025a.servicebus.windows.net";
        var topicName = "topic-das1-a";

        // DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();

        String chave = System.getenv("CHAVE");
        var subscription = "subscription-guilhermesarturi";

        ServiceBusProcessorClient processorClient = 
            new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(servidor)
                .connectionString(chave)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .topicName(topicName)
                .subscriptionName(subscription)
                .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                .processMessage(foo ->{
                    System.out.println("MSG: " + foo.getMessage().getBody().toString());
                    foo.complete();
                })
                .processError(bar ->{
                    System.out.println("DEU PAU AQUI");
                })
                .buildProcessorClient();
            processorClient.start();

    }
}
