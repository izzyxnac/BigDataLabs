package edu.supmti.kafka;

import org.apache.kafka.clients.producer.*;
import java.util.Properties;
import java.util.Scanner;

public class WordProducer {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tapez un texte (CTRL+C pour quitter) :");

        while (true) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");

            for (String word : words) {
                ProducerRecord<String, String> record =
                        new ProducerRecord<>("WordCount-Topic", word);
                producer.send(record);
                System.out.println("Envoyé : " + word);
            }
        }
    }
}
