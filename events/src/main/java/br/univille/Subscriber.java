package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Subscriber {
    public static void main(String[] args) {
        var server = "sbdas12025a.servicebus.windows.net";
        var topic = "topic-das1-a";

        String chave = System.getenv("CHAVE");
        String subscription = "subscription-iansergio";

        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(server)
                .connectionString(chave)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .topicName(topic)
                .subscriptionName(subscription)
                .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                .processMessage(context -> {
                    System.out.println("Mensagem: " +
                            context.getMessage()
                                    .getBody().toString());
                    context.complete();
                })
                .processError(context -> {
                    System.out.println("Não deu certo");
                })
                .buildProcessorClient();

        processorClient.start();
    }
}
