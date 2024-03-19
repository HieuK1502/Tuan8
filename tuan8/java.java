/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan8;
import java.io.*;
import java.net.*;
import tuan8.Student;
/**
 *
 * @author hoang
 */
public class java {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server dang chay...");
            while (true) {
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                Student student = new Student("Tran Van B", 21);
                oos.writeObject(student);
                oos.close();
                socket.close();
            }
        } catch (Exception e) {
        }
        
    }
}
