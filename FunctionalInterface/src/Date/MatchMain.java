package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number of matches: ");
		int n=sc.nextInt();
		Match m[]=new Match[n];
		
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		for(int i=0;i<n;i++)
		{
			System.out.println("Match"+(i+1)+" Details");
			System.out.println("Enter the team 1");
			String team1=sc.next();
			
			
			System.out.println("Enter the team 2");
			String team2=sc.next();
			
			System.out.println("Enter the match date: ");
			
			String mydate=sc.next();
			
			
			
			Date d=s.parse(mydate);
			 
			
			
			m[i]=new Match(team1,team2,d);
			
		}
		
		List<Match> mlist=Arrays.asList(m);
		
		Collections.sort(mlist, new MyMatch());
		for(Match match:mlist)
		{
			System.out.println(match.getTeam1()+"-"+match.getTeam2()+"-"+s.format(match.getMatchDate()));
		}

	}

}
