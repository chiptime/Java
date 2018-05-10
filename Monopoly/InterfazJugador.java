package net.ddns.noidea;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

public class InterfazJugador {

    ArrayList<Texture> texturas = new ArrayList<Texture>();

    TextureRegion[][] regions;

    private Integer numero;

    public InterfazJugador() {
        /*for (int i = 1; i <= 6; i++) {
            texturas.add(new Texture("dado"+i+".gif"));
        }*/
        Texture texture = new Texture("dadosjuntos.png");
        regions = TextureRegion.split(texture,200 ,100);
        setNumber(1);
    }

    public void setNumber(int number) {
        numero = number;
    }

    public Integer getNumber() {
        return numero;
    }


    public TextureRegion getImg() {
        int a = numero / 3 >= 1 ? 1 : 0;
        int b = numero > 3 ? numero -3 : numero;
        return regions[a][b-1];
    }
}
