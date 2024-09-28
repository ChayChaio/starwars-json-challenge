package com.aluracursos.starwarsjsonchallenge.main;

import com.aluracursos.starwarsjsonchallenge.clases.Pelicula;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        List<Pelicula> lista = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

    }
}