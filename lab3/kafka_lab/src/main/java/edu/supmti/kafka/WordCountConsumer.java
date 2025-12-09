package edu.supmti.kafka;

import org.apache.kafka.clients.consumer.*;
import java.time.Duration;
import java.util.*;

public class WordCountConsumer {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094");
        props.put("group.id", "wordcount-group");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("auto.offset.reset", "earliest");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList("WordCount-Topic"));

        Map<String, Integer> wordCount = new HashMap<>();

        System.out.println("Consommateur démarré...");

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(500));

            for (ConsumerRecord<String, String> record : records) {
                String word = record.value();

                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                System.out.println("Mot = " + word + " | compteur = " + wordCount.get(word));
            }
        }
    }
}
