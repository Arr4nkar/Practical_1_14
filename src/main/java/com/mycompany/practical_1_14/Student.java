/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_1_14;

import java.util.concurrent.Semaphore;

/**
 *
 * @author gnekh
 */
class Student extends Thread {
    private int id;
    private Semaphore table;

    public Student(int id, Semaphore table) {
        this.id = id;
        this.table = table;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Student " + id + " waiting");
                table.acquire(); 
                System.out.println("Student " + id + " eating");
                Thread.sleep(3000); 
                System.out.println("Student " + id + " exit");
                table.release(); 
                break; 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
