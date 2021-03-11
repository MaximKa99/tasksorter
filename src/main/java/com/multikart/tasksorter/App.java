package com.multikart.tasksorter;

import com.multikart.tasksorter.exception.handler.ExceptionHandler;
import com.multikart.tasksorter.starter.Starter;

public class App {
    public static void main( String[] args ) {
        Starter starter = new Starter();

        try {
            starter.start(args);
        } catch (Exception ex) {
            ExceptionHandler.handle(ex);
        }
    }
}
