package controler.controlerLocal;

import model.Coord;
import model.Couleur;
import model.observable.ChessGame;

public class ChessGameControler implements ChessGameControlers{
	ChessGame chessgame;

	public ChessGameControler(ChessGame chessgame) {
		super();
		this.chessgame = chessgame;
	}

	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {
		return chessgame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		return chessgame.getMessage();
	}

	@Override
	public boolean isEnd() {
		return chessgame.isEnd();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		return chessgame.getColorCurrentPlayer();
	}
	
	public String toString()
	{
		return chessgame.toString();
	}



	
	

}
