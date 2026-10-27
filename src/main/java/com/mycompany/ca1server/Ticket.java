/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca1server;

/**
 *
 * @author lapi
 */
public class Ticket {
    private String ticketId;
    private String studentName;
    private String category;
    private String description;
    static  int count = 0;
    
    {
    count +=1;
    }
    
    public Ticket(String studentName,String category,String description){
        
        String Temp = "T" + count;
        this.ticketId = Temp;
        this.studentName = studentName;
        this.category = category;
        this.description = description;
           
        }
    
    public String getTickedId(){
        return this.ticketId;
    }
    
    public String toString(){
    
        return ticketId + "-" + category+ "-"+ description;
    }
    
    
}
