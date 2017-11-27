package Film;

import java.util.Comparator;

public class ScoreCompare implements Comparator<Film>{

	@Override
	public int compare(Film o1, Film o2) {
		
		return (int) (o1.getScore()-o2.getScore());
	}

}
