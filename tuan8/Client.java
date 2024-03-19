/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan8;
import java.io.*;
import java.net.*;
/**
 *
 * @author hoang
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Student student = (Student)ois.readObject();
            System.out.println("Da nhan duoc: "+student.getName()+" - "+student.getAge());
            ois.close();
            socket.close();
        } catch (Exception e) {
        }
    }
}
