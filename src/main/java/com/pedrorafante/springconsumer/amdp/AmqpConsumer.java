package com.pedrorafante.springconsumer.amdp;

public interface AmqpConsumer<T> {

    void consumer(T t);
}
