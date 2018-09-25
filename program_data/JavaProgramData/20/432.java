package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		String c = new String(new char[15]);
		int j;
		int l;
		int max;
		while (scanf("%s%s", a, b) != EOF)
		{
			max = 0;
			j = 0;
			l = a.length();
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) > a.charAt(max))
				{
					max = j;
				}
			}
			for (j = 0;j <= max; j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
			}
			for (j = 1;j <= 3;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j + max, b.charAt(j - 1));
			}
			for (j = max + 1;j < l;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j + 3, a.charAt(j));
			}
			c = tangible.StringFunctions.changeCharacter(c, l + 3, '\0');
			System.out.println(c);
		}
	}
}

