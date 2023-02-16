package teamNameAndNoOfMatches;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of teams");
		int n = sc.nextInt();
		List<Team> teams = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			   System.out.println("Enter team" + (i+1) + "detail");
			   System.out.println("Enter Name");
	            String name = sc.next();
	            System.out.println("Enter number of matches");
	            Long numberOfMatches = sc.nextLong();
	            
	            
	            Team team = new Team(name, numberOfMatches);
	            teams.add(team);
	}
		
		Collections.sort(teams, new TeamComparator());

		System.out.println("Team list after sort by number of matches");
        for (Team team : teams) {
            System.out.println(team.getName() + " - " + team.getNumberOfMatches());
        }

}


	}


