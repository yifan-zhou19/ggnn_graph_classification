package <missing>;

public class GlobalMembers
{
	public static int max(String x)
	{
		int m;
		int i;
		int n = 0;
		char a = x[0];
		m = x.length();
		for (i = 1;i <= m - 1;i++)
		{
			if (x[i].compareTo(a) > 0)
			{
				a = x[i];
				n = i;
			}
		}
		return n;
	}
	public static void Main()
	{
		int n;
		int l;
		int j;
		String sa = new String(new char[14]);
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			 l = str.length();
			n = max(str);
			for (j = 0;j <= n;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, str.charAt(j));
			}
			for (j = n + 1;j <= n + 3;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, substr.charAt(j - n - 1));
			}
			for (j = n + 4;j <= l + 2;j++)
			{
				sa = tangible.StringFunctions.changeCharacter(sa, j, str.charAt(j - 3));
			}
			sa = tangible.StringFunctions.changeCharacter(sa, l + 3, '\0');
			System.out.printf("%s\n",sa);
		}
	}

}

