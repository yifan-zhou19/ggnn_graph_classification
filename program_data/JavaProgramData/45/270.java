package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "\0";
		final String s = "\0";
		final String w = "\0";
		final String t = "\0";
		int i = 0;
		int j;
		int m;
		int ls;
		int lw;
		str = new Scanner(System.in).nextLine();
		for (j = 0;str.charAt(j) != ' ';j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(j));
		}
		for (m = j + 1;str.charAt(m);m++)
		{
			w = tangible.StringFunctions.changeCharacter(w, m - j - 1, str.charAt(m));
		}
		ls = s.length();
		lw = w.length();
		for (i = 0;i <= (lw - ls);i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
				for (j = 0;j < ls;j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j, w.charAt(i + j));
				}
				if (strcmp(s,t) == 0)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
	}
}

