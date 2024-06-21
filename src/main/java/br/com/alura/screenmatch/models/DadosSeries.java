package br.com.alura.screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("Title") String Title,
                          @JsonAlias("totalSeasons")Integer totalSeasons,
                          @JsonAlias("imdbRating")String imdbRating) {
}
