package org.example.entities;

import java.util.List;

public class user {
    private String name;
    private String password;
    private String hashPassword;

    private List<Ticket> ticketBooked;
    private String userId;

    public user(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.password = password;
        this.hashPassword = hashedPassword;
        this.ticketBooked = ticketsBooked;
        this.userId = userId;
    }
    public user(){}

    public static String getName() {
        return name;
    }

    public static String getPassword(){
        return password;
    }

    public String getHashedPassword() {
        return hashPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketBooked;
    }

    public void printTickets(){
        for (int i = 0; i<ticketBooked.size(); i++){
            System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketBooked = ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
