package com.mycompany.ca1server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class CA1Server {
    public static void main(String[] args) {



        Manager man = new Manager();


        try {

            ServerSocket s = new ServerSocket(8071);
            System.out.println("Server ready");
            while (true) try {
                Socket ss = s.accept();
                System.out.println("Server connected");

                Thread td = new Thread(new Handler(ss, man));
                td.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException e) {
           System.out.println(e.getMessage());
        }


    }
}