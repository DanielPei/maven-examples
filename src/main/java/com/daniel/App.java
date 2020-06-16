package com.daniel;

import com.daniel.kafka.ConsumerDemo;
import com.daniel.kafka.ProducerDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProducerDemo producerDemo = new ProducerDemo();
        producerDemo.demo();

        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.demo();

        System.out.println( "Hello World!" );
    }
}
