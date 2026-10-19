/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ca1server;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
/**
 *
 * @author lapi
 */
public class CA1Server {

    public static void main(String[] args) {

        try {
            System.out.println("Waiting for client");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("connection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            System.out.println(str);
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            
            out.println(str);
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
