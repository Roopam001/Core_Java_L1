package topic2.assi6;

import topic2.assi6.Music.Playable;
import topic2.assi6.Music.string.Veena;
import topic2.assi6.Music.wind.Saxophone;

public class topic2_assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veena veena = new Veena();
		veena.play();
		
		Saxophone sax = new Saxophone();
		sax.play();
		
		Playable[] playable = new Playable[]{veena, sax};
		for(int i = 0; i < playable.length; i++){
			playable[i].play();
		}

	}

}
