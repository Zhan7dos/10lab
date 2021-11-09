package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle []tr = new Triangle[10];
        int []minS = new int[4];
        int []maxS = new int[4];
        tr[0]= new Triangle(4, 4, 5);
        tr[1]= new Triangle(3, 4, 5);
        tr[2]= new Triangle(6, 6, 6);
        tr[3]= new Triangle(6, 1, 9);
        tr[4]= new Triangle(8, 1, 4);
        tr[5]= new Triangle(6, 8, 2);
        tr[6]= new Triangle(3, 4, 1);
        tr[7]= new Triangle(6, 6, 2);
        tr[8]= new Triangle(4, 8, 1);
        tr[9]= new Triangle(7, 7, 7);
        for(int i = 0; i < 4; i++){
            minS[i] = 999;
            maxS[i] = -999;
        }

        for(int i = 0; i < 10; i++){
            tr[i].checkTip();
            tr[i].Perimemr();
        }
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Прямоугольный") ){
                if(tr[i].P < minS[0])
                    minS[0] = tr[i].P;
                if(tr[i].P > maxS[0])
                    maxS[0] = tr[i].P;
            }
            if(tr[i].Tip.equals("Pавностороний")){
                if(tr[i].P < minS[1])
                    minS[1] = tr[i].P;
                if(tr[i].P > maxS[1])
                    maxS[1] = tr[i].P;
            }
            if(tr[i].Tip.equals("Pавнобедренный")){
                if(tr[i].P < minS[2])
                    minS[2] = tr[i].P;
                if(tr[i].P > maxS[2])
                    maxS[2] = tr[i].P;
            }
            if(tr[i].Tip.equals("Разносторонний")){
                if(tr[i].P < minS[3])
                    minS[3] = tr[i].P;
                if(tr[i].P > maxS[3])
                    maxS[3] = tr[i].P;
            }
        }
        System.out.println("Прямоугольные треугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Прямоугольный") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }
        System.out.println("Max: "+maxS[0]);
        System.out.println("Min:" + minS[0]);
        System.out.println("Pавностороные треугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Pавностороний") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }System.out.println("Max: "+maxS[1]);
        System.out.println("Min:" + minS[1]);
        System.out.println("Pавнобедренные треугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Pавнобедренный") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }System.out.println("Max: "+maxS[2]);
        System.out.println("Min:" + minS[2]);
        System.out.println("Разносторонные треугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Разносторонний") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }
        System.out.println("Max: "+maxS[3]);
        System.out.println("Min:" + minS[3]);
    }

}
