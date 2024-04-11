/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical_1_14;

import java.util.concurrent.Semaphore;

/**
 *
 * @author gnekh
 */
public class Practical_1_14 {
    public static void main(String[] args) {
        System.out.println("Нехаев Глеб Сергеевич, вариант 2, группа РИБО-01-22");
        Semaphore table = new Semaphore(2); 

        for (int i = 1; i <= 7; i++) {
            new Student(i, table).start();
        }
    }
}
