package ru.gb;

public class Main {
    public static final int size = 10000000;
    public static final int h = size / 2;

    public static void main (String[] args) {
        OneThread ();
        PolyThreads();
    }

    public static void OneThread () {
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        System.out.println("The first process started");

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Process finished in " + (System.currentTimeMillis() - a) + " mls");
    }

    public static void PolyThreads () {
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        System.out.println("The second process started");

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread Thread1 = new MyThread();
        MyThread Thread2 = new MyThread();
        Thread1.start();
        Thread2.start();

        System.arraycopy(Thread1.calc(a1), 0, arr, 0, h);
        System.arraycopy(Thread1.calc(a1), 0, arr, h, h);

        try {
            Thread1.join();
            Thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Process finished in " + (System.currentTimeMillis() - a) + " mls");

    }
}
