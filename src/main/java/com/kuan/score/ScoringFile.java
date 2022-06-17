package com.kuan.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {//一個try至少一個catch
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
                //System.out.println(line);
                //Tony,80,90
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name,english,math);
                stu.print();
                line = reader.readLine();
            }


            /*int data = fileReader.read();
            while (data != -1){//沒資料時會讀出-1
                System.out.print((char) data);
                data = fileReader.read();
            }*/
        } catch (FileNotFoundException ex){
            System.out.println("File read failed");
        }catch (IOException e){
            System.out.println("info read failed");
        }
        /*catch (Exception e){
            System.out.println("Problem");
        }*/
        System.out.println("gogogo");
    }
}