package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String w = "";
		final String a = "";
		final String b = "";
		int i;
		int j;
		int x;
		int y;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < (a.length());i++)
		{
			if (a.charAt(i) == ' ')
			{
			k = i;
			}
		}
		for (i = 0;i < k;i++)
		{
		s = tangible.StringFunctions.changeCharacter(s, i, a.charAt(i));
		}
		for (i = k + 1;i < (a.length());i++)
		{
		w = tangible.StringFunctions.changeCharacter(w, i - k - 1, a.charAt(i));
		}
		x = s.length();
		y = w.length();
		for (i = 0;i < y;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = i;j < i + x;j++)
				{
				b = tangible.StringFunctions.changeCharacter(b, j - i, w.charAt(j));
				}
				if (strcmp(b,s) == 0)
				{
					System.out.printf("%d\n",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		return 0;
	}

}

