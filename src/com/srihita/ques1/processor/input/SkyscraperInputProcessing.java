package com.srihita.ques1.processor.input;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class SkyscraperInputProcessing {
    private int floorCount;
    final Queue<Integer> floorSequence = new LinkedList<>();
    final TreeSet<Integer> sortedFloorSequence = new TreeSet<>();

    public int getFloorCount() {
        return floorCount;
    }

    public Queue<Integer> getFloorSequence() {
        return floorSequence;
    }

    public TreeSet<Integer> getSortedFloorSequence() {
        return sortedFloorSequence;
    }

    public void processInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the total no of floors in the building");
        floorCount = sc.nextInt();
        for (int i = 0; i < floorCount; i++) {
            System.out.println("enter the floor size given on day :" + (i + 1));
            int temp = sc.nextInt();
            floorSequence.add(temp);
            sortedFloorSequence.add(temp);
        }
    }
}