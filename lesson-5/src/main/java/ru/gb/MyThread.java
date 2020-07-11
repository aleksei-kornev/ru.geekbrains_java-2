package ru.gb;

public class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("New thread started");
        }

        public float[] calc (float[] arr) {
            float[] arrReturn = new float[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arrReturn[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            return arrReturn;
        }
    }

