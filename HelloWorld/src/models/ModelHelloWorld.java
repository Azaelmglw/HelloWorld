package models;

/**
 *
 * @author Azael_Mendoza
 */
public class ModelHelloWorld {
    private String user_name = "Boris";
    private String message = "It Works";
    
    public String getUser_Name(){
        return user_name;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setUser_Name(String user_name){
        this.user_name = user_name;
    }
    
    public void setMessage(String message){
        this.message = message;
    }  
    
}