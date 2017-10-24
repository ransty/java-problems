import java.awt.List;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class AppendSubstringCount {
	
	public static void main(String args[]) {
		String p = "";
		String s = "hello";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (p.contains(s.substring(i, i+1))) {
				continue;
			}
			p+=s.substring(i, i+1);
			count++;
		}
		System.out.println(p);
		System.out.println(count);
    }

}
