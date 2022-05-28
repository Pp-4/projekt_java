package com.company.CustomErrors;

public class WrongTypeException extends RuntimeException{
    public WrongTypeException(){
        super("Nieprawidłowy typ zmiennej!");
    }
}
