package ru.ress.coursework;

import ru.ress.coursework.core.Base;
import ru.ress.coursework.gui.MainForm;

/**
 * Created by ress on 26.09.17.
 */
public class Main {
    public static void main(String args[]) {
        new MainForm("Base 3", new Base("testBase3.dat"));
        return;
    }
}
