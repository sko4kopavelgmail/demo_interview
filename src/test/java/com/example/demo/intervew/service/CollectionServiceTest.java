package com.example.demo.intervew.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class CollectionServiceTest {

    @Autowired
    private CollectionService collectionService;

    @Test
    void countValues() {
        Map<Integer, Integer> map = collectionService.countValues(null);
        assertNull(map);
    }
}