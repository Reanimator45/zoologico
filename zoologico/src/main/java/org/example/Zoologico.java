package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal Animal1 = new Animal();
        Animal1.nombre="Cebra";
        Animal1.genero="F";


        Animal Animal2 = new Animal();
        Animal2.nombre="Caballo";
        Animal2.genero="M";


        Animal1.encontrarPareja(Animal2);


        Familia familia = new Familia(Animal2,Animal1);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}