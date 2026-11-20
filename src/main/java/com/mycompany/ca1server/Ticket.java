package com.mycompany.ca1server;

public class Ticket {
    private String studentName;
    private String ticketNumber;
    private String category;
    private String note;


    public Ticket(String studentName,String ticketNumber,String category,String note){
        this.category = category;
        this.note = note;
        this.studentName= studentName;
        this.ticketNumber = ticketNumber;

    }


    public String getStudentName(){
        return  this.studentName;

    }
    public  String getTicketNumber(){
        return  this.ticketNumber;

    }

    public String getCategory(){
        return this.category;

    }

    public String getNote() {
        return note;
    }

    @Override
  public String toString(){

        return ticketNumber + " - " + category + " - " + note;

    }



}
