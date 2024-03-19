/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author hoang
 */
public class Demo81 {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van A", 20);
        try {
            FileOutputStream fileOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close(); 
            fileOut.close();
            System.out.println("Da tuan tu hoa va ghi doi tuong vao file ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //doc doi tuong
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student stdFromFile = (Student)in.readObject();
            System.out.println("Da doc doi tuong tu file");
            System.out.println("Ten: "+stdFromFile.getName());
            System.out.println("Tuoi: "+stdFromFile.getAge());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
}
