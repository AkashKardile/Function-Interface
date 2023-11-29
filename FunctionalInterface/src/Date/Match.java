package Date;

import java.util.Date;

public class Match {
	
	String team1;
	
	String team2;
	
	Date matchDate;

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	@Override
	public String toString() {
		return "Match [team1=" + team1 + ", team2=" + team2 + ", matchDate=" + matchDate + "]";
	}

	public Match(String team1, String team2, Date matchDate) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.matchDate = matchDate;
	}

	public Match() {
		super();
	}
	
	
	

}
