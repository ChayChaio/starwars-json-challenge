package com.aluracursos.starwarsjsonchallenge.clases;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private int idDelEpisodio;
    private String parrafoIntroductorio;
    private String director;
    private String productor;
    private String fechaDeLanzamiento;

    public Pelicula(String titulo, int idDelEpisodio, String parrafoIntroductorio, String director, String productor, String fechaDeLanzamiento) {
        this.titulo = titulo;
        this.idDelEpisodio = idDelEpisodio;
        this.parrafoIntroductorio = parrafoIntroductorio;
        this.director = director;
        this.productor = productor;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Pelicula(PeliculaSwapi peliculaSwapi){
        this.titulo = peliculaSwapi.title();
        this.idDelEpisodio = peliculaSwapi.episode_id();
        this.parrafoIntroductorio = peliculaSwapi.opening_crawl();
        this.director = peliculaSwapi.director();
        this.productor = peliculaSwapi.producer();
        this.fechaDeLanzamiento = peliculaSwapi.release_date();
    }
}
