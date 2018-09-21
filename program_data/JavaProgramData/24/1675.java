package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		String b = new String(new char[50]);
		String d = new String(new char[50]);
		int i;
		int k;
		int len;
		int leng = 0;
		int u = 0;
		int e;
		int c;
		int m = 50;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i <= len;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				leng = leng + 1;
			}
			if (a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '\0')
			{
				c = leng;
				leng = 0;
				if (c > u)
				{
					e = c;
					c = u;
					u = e;
					for (k = 0;k < u;k++)
					{
						b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i - u + k));
						b = tangible.StringFunctions.changeCharacter(b, u, '\0');
					}
				}
			}
		}
		System.out.printf("%s\n",b);
	for (i = 0;i <= len;i++)
	{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != '\0')
			{
				leng = leng + 1;
			}
			if ((a.charAt(i) == ' ' || a.charAt(i) == ',' || a.charAt(i) == '\0') && a.charAt(i - 1) != ' ' && a.charAt(i - 1) != ',')
			{
				c = leng;
				leng = 0;
				if (c < m)
				{
					e = c;
					c = m;
					m = e;
					for (k = 0;k < m;k++)
					{
						d = tangible.StringFunctions.changeCharacter(d, k, a.charAt(i - m + k));
						d = tangible.StringFunctions.changeCharacter(d, m, '\0');
					}
				}
			}
	}
		System.out.printf("%s\n",d);




		return 0;

	}
}

