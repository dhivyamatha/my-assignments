package week4day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Learnset {

	public static void main(String[] args) {
	


String companyName = "google";
char[] array= companyName.toCharArray();

  Set<Character> duplicate= new LinkedHashSet<Character>();

for (Character ch: array ) {
    duplicate.add(ch);
}
System.out.print(duplicate);


	}

}
