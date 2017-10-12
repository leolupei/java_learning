package com.example.java_learning_week3.Services;

import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class Week3ServiceImpl implements Week3Service {


    @Override
    public int[] getRandomNumbers() throws Exception {

        int[] values = new int[1000];
        Random random = new Random();
        for (int x = 0; x < 1000; x++) {
            values[x] = x * 10 + random.nextInt(9);
        }

        return values;
    }

}
