package dev.jsconsulting;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min val: " + myMinFloatValue);
        System.out.println("Float max val: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min val: " + myMinDoubleValue);
        System.out.println("Double max val: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);

        double pounds = 60d;
        double kgs = pounds * 0.45359237d;
        System.out.println(pounds + " pounds in kgs: " + kgs);

    }
}
