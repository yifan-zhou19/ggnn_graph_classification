package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int x;
		int y;
		String s = new String(new char[150]);
		String t = new String(new char[150]);
		char a;
		char b;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		x = s.length();
		y = t.length();
		for (i = 0;i < x;i++)
		{
			a = s.charAt(i);
			if (a >= 'a' && a <= 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
		for (j = 0;j < y;j++)
		{
			b = t.charAt(j);
			if (b >= 'a' && b <= 'z')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, t.charAt(j) - 32);
			}
		}
		if (strcmp(s,t) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(s,t) < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}
	}
}

