package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAnsLazy_Math {

	public static void main(String[] args) {
		
		String str1 = "XXfdugshYYyfuwgXXytufgh6XXjfri89378ijYYgusdfhXXfvgfgfgXXhggYYjhjj";

		String patt = "XX.*?YY";

		Pattern p = Pattern.compile(patt);

		Matcher m = p.matcher(str1);

		System.out.println( m.results().count());

		m.reset();

		while(m.find()) {
			
			System.out.println("starts at:"+m.start());
			System.out.println(m.group());

		}
		
	}

}
