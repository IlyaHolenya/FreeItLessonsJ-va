package com.company;

/*

Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?

 */

public class Task1 {

    public static void main(String[] args) {
        // дистанция  в первый день
        double distance = 10.0;
        double total_distance = 10.0;
        for (int i = 0; i < 6; i++) {
            distance += distance * 0.1;
            total_distance += distance;
        }
        System.out.println("Спортсмен пробежал за 7 дней суммарно " + String.format("%.2f", total_distance) + " км.");
    }
}
