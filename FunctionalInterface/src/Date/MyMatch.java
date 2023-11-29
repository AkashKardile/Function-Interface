package Date;

import java.util.Comparator;

public class MyMatch implements Comparator<Match>{

	@Override
	public int compare(Match m1, Match m2) {
		if(m1.getMatchDate().compareTo(m2.getMatchDate())==0)
		{
			return 0;
		}
		else if(m1.getMatchDate().compareTo(m2.getMatchDate())>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
