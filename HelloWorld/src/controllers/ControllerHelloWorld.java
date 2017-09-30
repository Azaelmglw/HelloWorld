package controllers;

import views.*;
import models.*;

/**
 *
 * @author Azael_Mendoza
 */
public class ControllerHelloWorld {
    ViewHelloWorld view_hello_world;
    ModelHelloWorld model_hello_world;
    
    public ControllerHelloWorld(ViewHelloWorld view_hello_world, ModelHelloWorld model_hello_world){
        this.view_hello_world = view_hello_world;
        this.model_hello_world = model_hello_world;
        initView();
    }
    
    public void initView(){
        view_hello_world.jbtn_bye.addActionListener(e -> jbtn_byeMouseClicked());
        view_hello_world.jbtn_hello.addActionListener(e -> jbtn_helloMouseClicked());
        view_hello_world.jtf_user_name.setText(model_hello_world.getUser_Name());
        view_hello_world.jlb_message_display.setText(model_hello_world.getMessage());
        view_hello_world.setTitle("Hello World GitHub");
        view_hello_world.setLocationRelativeTo(null);
        view_hello_world.setVisible(true);
    }
    
    public void jbtn_byeMouseClicked(){
        model_hello_world.setUser_Name(view_hello_world.jtf_user_name.getText());
        model_hello_world.setMessage("Bye " + model_hello_world.getUser_Name());
        view_hello_world.jlb_message_display.setText(model_hello_world.getMessage());
    }
    
    public void jbtn_helloMouseClicked(){
        model_hello_world.setUser_Name(view_hello_world.jtf_user_name.getText());
        model_hello_world.setMessage("Hello " + model_hello_world.getUser_Name());
        view_hello_world.jlb_message_display.setText(model_hello_world.getMessage());
    }
}