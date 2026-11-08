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

    final private String ticketId;
     final private String studentName;
    final private String category;
    final private String description;

    public Ticket(String ticket, String studentName, String category, String description) {
        this.category = category;
        this.description = description;
        this.studentName = studentName;

        this.ticketId = ticket;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {

        return ticketId + " - " + category + " - " + description;
    }

}
