package com.srihita.ques1.processor.output;

import com.srihita.ques1.processor.input.SkyscraperInputProcessing;

import java.util.TreeSet;

public class SkyscraperOutputProcessing {
    public void processOutput(SkyscraperInputProcessing inputProcessor) {
        System.out.println("The order of construction is as follows");
        TreeSet<Integer> floorsOnHold = new TreeSet<>();
        Integer highestFloor = inputProcessor.getSortedFloorSequence().pollLast();
        Integer currentFloor;
        for (int i = 0; i < inputProcessor.getFloorCount(); i++) {
            currentFloor = inputProcessor.getFloorSequence().poll();
            System.out.println("Day:" + (i + 1));
            if (highestFloor != currentFloor) {
                System.out.println("");
                floorsOnHold.add(currentFloor);
            } else {
                System.out.print(highestFloor);
                highestFloor = inputProcessor.getSortedFloorSequence().pollLast();
                while (floorsOnHold.size() > 0) {
                    if (floorsOnHold.last() == highestFloor) {
                        System.out.print(" " + floorsOnHold.pollLast());
                        highestFloor = inputProcessor.getSortedFloorSequence().pollLast();
                    } else {
                        break;
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
