package br.com.alura.desafioMusicas.principal;

import br.com.alura.desafioMusicas.modelos.MinhasPreferidas;
import br.com.alura.desafioMusicas.modelos.Musica;
import br.com.alura.desafioMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.setTitulo("This Feeling");
        musica.setArtista("Vintage Culture");

        for (int i = 0; i < 2100; i++) {
            musica.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();

        podcast.setTitulo("Flow");
        podcast.setHost("Igor");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 110; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}
