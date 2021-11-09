package com.company;

public class Triangle {
    public int a,b,c, P;
    public String Tip;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Perimemr() {
        this.P = this.a + this.b + this.c;
    }
    public void checkTip(){
        if (c == Math.sqrt(a*a + b*b))
            this.Tip = "Прямоугольный";

        if ((c == b) && (c == a))
            this.Tip = "Pавностороний";
        else
        if ((a == b) || (b == c) || (a == c))
            this.Tip = "Pавнобедренный";
        if ((a != b) && (a != c) && (c != b))
            this.Tip = "Разносторонний";
    }
}

