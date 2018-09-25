package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??
		int b;
		int c;
		String ans = new String(new char[3]);
		for (a = 1;a <= 3;a++) //????????
		{
			 for (b = 1;b <= 3;b++)
			 {
				 if (a == b)
				 {
				 continue;
				 }
				 for (c = 1;c <= 3;c++)
				 {
					 if (a == c)
					 {
					 continue;
					 }
					 if (b == c)
					 {
					 continue;
					 }
					 if ((((b > a) + (0)) == (3 - a)) && (((a > b) + (a > c)) == (3 - b)) && (((c > b) + (b > a)) == (3 - c)))
					 {
						ans = tangible.StringFunctions.changeCharacter(ans, 3 - a, 'A');
						ans = tangible.StringFunctions.changeCharacter(ans, 3 - b, 'B');
						ans = tangible.StringFunctions.changeCharacter(ans, 3 - c, 'C');
					 }
				 }
			 }
		}
		System.out.print(ans.charAt(2));
		System.out.print(ans.charAt(1));
		System.out.print(ans.charAt(0));
		return 0;
	}

}

