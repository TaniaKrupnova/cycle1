package ru.netology.sqr;

public class SQRService {
    public int options(int min, int max) {
        int check = 0;
        int num;
        for (int i = 10; i <= 99; i++) {
            num = i * i;
            if ((num >= min) && (num <= max)) {
                check++;

            }
        }
        return check;

    }
}
