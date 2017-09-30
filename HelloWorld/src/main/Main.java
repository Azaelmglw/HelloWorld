package main;

import views.*;
import models.*;
import controllers.*;

/**
 *
 * @author Azael_Mendoza
 */
public class Main {
    
    public static void main (String oamg[]){
        ModelHelloWorld model_hello_world = new ModelHelloWorld();
        ViewHelloWorld view_hello_world = new ViewHelloWorld();
        ControllerHelloWorld controller_hello_world = new ControllerHelloWorld(view_hello_world, model_hello_world);
    }
    
}
