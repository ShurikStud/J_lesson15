package com.shurik.company;

public class Main {

    public static void main(String[] args) {

        Construction construction   = new Construction.Builder().addBase(56).addFloor(12).addRoof(33).addWalls(43).build();

        System.out.println(construction.toString());

        //==============================================


        Construction.Builder constrationBuilder = new Construction.Builder();

        constrationBuilder.addBase(23);
        // здесь строки кода
        constrationBuilder.addFloor(45);
        constrationBuilder.addRoof(2);


        Construction.Builder constrationBuilder2 = new Construction.Builder();

        constrationBuilder2.addBase(32);
        // здесь строки кода
        constrationBuilder2.addFloor(4);
        constrationBuilder2.addRoof(7);



        Construction construction1  = new Construction(constrationBuilder);
        System.out.println(construction1.toString());

        Construction construction2  = new Construction(constrationBuilder2);
        System.out.println(construction2.toString());

    }
}
