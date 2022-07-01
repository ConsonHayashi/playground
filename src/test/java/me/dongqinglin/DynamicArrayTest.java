package me.dongqinglin.capability.define;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class DynamicArrayTest {

    @Test
    void should_be_created() {
        // 语文 98， 数学 99， 英语 100
        DynamicArray scores = new DynamicArray();
        scores.put(98);
        scores.put(2, 99);
        Assertions.assertEquals(4, scores.length);
        scores.put(100);
        Assertions.assertEquals(4, scores.length);
    }

    @Test void should_be_printed() {
        // 语文 98， 数学 99， 英语 100
        DynamicArray scores = new DynamicArray();
        for (int i = 0; i < 100; i++) {
            scores.put(98);
            scores.put( 99);
            scores.put(100);
        }
        // scores.get(1000);
        String content = scores.show();
        System.out.println(content);
    }

}