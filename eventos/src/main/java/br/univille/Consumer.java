package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Consumer {
    public static void main(String[] args) {
        var servidor = "sb-das1-2025.servicebus.windows.net";
      
        String chave = System.getenv("CHAVE");
        String queue = "queue-guilhermesarturi";

        ServiceBusProcessorClient processorClient = 
            new ServiceBusClientBuilder()
                .fullyQualifiedNamespace(servidor)
                .connectionString(chave)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .queueName(queue)
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
