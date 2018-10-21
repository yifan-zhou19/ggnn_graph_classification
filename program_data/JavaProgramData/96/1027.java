package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int l;
		int p;
		int q;
		int i;
		final String s = "";
		final String x = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		m = s.charAt(0) - '0';
		for (i = 0;i < l - 1;i++)
		{
			m = m * 10 + s.charAt(i + 1) - '0';
			x = tangible.StringFunctions.changeCharacter(x, i, (m / 13) + '0');
			m = m % 13;
		}
		if (x.charAt(0) == '0')
		{
			for (i = 0;i < l;i++)
			{
				x = tangible.StringFunctions.changeCharacter(x, i, x.charAt(i + 1));
			}
		}
		if (x.charAt(0) == '\0')
		{
			x = tangible.StringFunctions.changeCharacter(x, 0, '0');
		}
		System.out.printf("%s\n%d\n",x,m);
	}
}

