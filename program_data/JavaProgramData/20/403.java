package <missing>;

public class GlobalMembers
{
	public static void s(String c, String d)
	{
		int max = 0;
		int n;
		int y;
		int z;
		for (n = 0;n < 10;n++)
		{
			if (c[n].compareTo(max) > 0)
			{
				max = c[n];
				y = n;
			}
			if (c[n].equals('\0'))
			{
				z = n;
				break;
			}
		}
		for (n = z - 1;n > y;n--)
		{
			c[n + 3] = c[n];
		}
		c[y + 1] = d[0];
		c[y + 2] = d[1];
		c[y + 3] = d[2];
	}
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int i;
		while (scanf("%s %s",a,b) != EOF)
		{
			s(a, b);
			System.out.printf("%s\n",a);
			for (i = 0;i < 20;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			}
			for (i = 0;i < 4;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
		}
	}
}

