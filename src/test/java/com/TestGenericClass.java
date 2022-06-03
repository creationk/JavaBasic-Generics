package com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestGenericClass {

    @Test
    void test() {

        @Getter
        @Setter
        @AllArgsConstructor
        @ToString
        class Data<T> implements GenericInterface<T> {
            // T -> Type parameter
            private T data;

            @Override
            public T getDummyData() {
                return data;
            }
        }

        Data<String> d1 = new Data<>("abc");
        Data<Integer> d2 = new Data<>(123);


        log.info(String.valueOf(d1));

        //int data = (int) d1.getData(); //compile time error
        int data2 = d2.getData();

        log.info(String.valueOf(d2.getDummyData()));


    }
}
