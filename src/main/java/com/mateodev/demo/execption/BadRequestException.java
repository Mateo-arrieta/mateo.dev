package com.mateodev.demo.execption;

public class BadRequestException extends RuntimeException{

        public BadRequestException(String message){
            super(message); //super es palabra reservada y trae la exceptions de la clase padre
        }
}
