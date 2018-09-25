package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String s = new String(new char[10001]);
		int[] n = new int[101];
		int i;
		for (i = 0;i <= 100;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int lc;
		lc = c.length();
		n[0] = -1;
		int j = 1;
		for (i = 0;i <= (lc - 1);i++)
		{
			if (c.charAt(i) == ' ')
			{
				n[j] = i;
				j++;
			}
		}
		n[j] = lc;
		String x = new String(new char[2]);
		x = tangible.StringFunctions.changeCharacter(x, 0, ' ');
		x = tangible.StringFunctions.changeCharacter(x, 1, '\0');
		for (i = 1;i <= j;i++)
		{
			int l;
			int m;
			String ch = new String(new char[101]);
			for (m = 0;m <= 100;m++)
			{
				ch = tangible.StringFunctions.changeCharacter(ch, m, '\0');
			}
			l = n[i] - n[i - 1] - 1;
			for (m = 0;m <= (l - 1);m++)
			{
				ch = tangible.StringFunctions.changeCharacter(ch, m, c.charAt(n[i - 1] + m + 1));
			}
			if (strcmp(a,ch) == 0)
			{
				s += b;
			}
			else
			{
				s += ch;
			}
			if (i < j)
			{
				s += x;
			}
		}
		System.out.println(s);
	}
}

