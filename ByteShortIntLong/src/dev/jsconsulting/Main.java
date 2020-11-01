package dev.jsconsulting;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum val: " + myMinIntValue);
        System.out.println("Integer maximum val: " + myMaxIntValue);
        System.out.println("Busted max val: " + (myMaxIntValue + 1));
        System.out.println("Busted min val: " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value " + myMinByteValue);
        System.out.println("Byte max value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value " + myMinShortValue);
        System.out.println("Short max value " + myMaxShortValue);

        long myLongValue = 9223372036854L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value " + myMinLongValue);
        System.out.println("Long max value " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue / 2);
    }
}
