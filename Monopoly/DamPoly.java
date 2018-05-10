package net.ddns.noidea;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import net.ddns.noidea.internal.Tablero;

public class DamPoly extends ApplicationAdapter {
	SpriteBatch batch;
	Dado dados[];
	Tablero tablero;
	InterfazJugador datoJugador[];

	private boolean showDados = false;

    public Dado[] getDados() {
        return dados;
    }

	public boolean isShowDados() {
		return showDados;
	}

	public void setShowDados(boolean showDados) {
		this.showDados = showDados;
	}

	public Tablero getTablero() {
		return tablero;
	}

	@Override
	public void create () {
    	dados = new Dado[2];
		batch = new SpriteBatch();
		dados[0] = new Dado();
		dados[1] = new Dado();
		tablero = Tablero.setInstance(this);


		datoJugador = new InterfazJugador[1];
		datoJugador[0] = new InterfazJugador();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();

		batch.draw(datoJugador[0].getImg(),50,50);

		if (isShowDados()) {
			batch.draw(dados[0].getImg(), 0, 0);
			batch.draw(dados[1].getImg(), 250, 0);
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
