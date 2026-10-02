package ru.german;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyStringBuilderWithUndo myStringBuilder = new MyStringBuilderWithUndo("Test");

        System.out.println(myStringBuilder);

        myStringBuilder.append(" first");

        System.out.println(myStringBuilder);

        myStringBuilder.undo();

        System.out.println(myStringBuilder);

        myStringBuilder.append(" second");

        System.out.println(myStringBuilder);

        myStringBuilder.undo();

        System.out.println(myStringBuilder);

        myStringBuilder.delete();

        System.out.println(myStringBuilder);

        myStringBuilder.undo();

        System.out.println(myStringBuilder);

    }
}