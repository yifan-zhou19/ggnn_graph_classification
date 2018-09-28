package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		final String a = "";
		final String b = "";
		char c;
		char d;
		int len1;
		int len2;
		int i;
		int j;
		int k;
		int x;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != ' ';i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(i));
		}
		for (x = 0,k = i + 1;s.charAt(k) != '\0';k++)
		{
			b = tangible.StringFunctions.changeCharacter(b, x, s.charAt(k));
			x++;
		}
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len1;i++)
		{
		for (j = 0;j < len1 - i - 1;j++)
		{
		if (a.charAt(j) > a.charAt(j + 1))
		{
			c = a.charAt(j);
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
			a = tangible.StringFunctions.changeCharacter(a, j + 1, c);
		}
		}
		}
		for (i = 0;i < len2;i++)
		{
		for (j = 0;j < len2 - i - 1;j++)
		{
		if (b.charAt(j) > b.charAt(j + 1))
		{
			d = b.charAt(j);
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
			b = tangible.StringFunctions.changeCharacter(b, j + 1, d);
		}
		}
		}

		if (len1 != len2)
		{
		System.out.print("NO");
		}
		else
		{
			if (strcmp(a,b) == 0)
			{
		System.out.print("YES");
			}
		else
		{
			System.out.print("NO");
		}
		}
	}
}

