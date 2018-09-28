package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[500]);
		String d = new String(new char[500]);
		int f = char d.charAt();
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		n = c.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j < n + 1 - i;j++)
			{
				for (k = 0;k < 500;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, k, '\0');
				}
				for (k = j;k < j + i;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, k - j, c.charAt(k));
				}
				if (f(d) == 1)
				{
					System.out.printf("%s\n",d);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		return 0;
	}
	public static int f(String d)
	{
		int m;
		int t;
		int s = 0;
		int ans;
		m = d.length();
		for (t = 0;t < m;t++)
		{
			if (d[t].equals(d[m - 1 - t]))
			{
				s = s + 1;
			}
		}
		if (s == m)
		{
			ans = 1;
		}
		else
		{
			ans = 0;
		}
		return ans;
	}
}

