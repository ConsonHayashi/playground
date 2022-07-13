package me.dongqinglin;


import org.junit.jupiter.api.Test;


class DynamicArrayTest {

    @Test
    void should_be_create() {
        // 语文 97， 数学 98， 英语 100
        DynamicArray array = new DynamicArray();
        array.put(97);
        array.put(98);
        array.put(100);
        String content = array.show();
    }
}