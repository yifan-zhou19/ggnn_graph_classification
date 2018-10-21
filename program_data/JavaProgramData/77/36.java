package <missing>;

public class GlobalMembers
{
	public static void ou(String x, int n, char c, char d)
	{

		int i;
		int j;

		for (i = 0;i < n;i++)
		{
			if (x[i].equals(d))
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (x[j].equals(c))
					{
						System.out.printf("%d %d\n",j,i);
						x[i] = '4';
						x[j] = '4';
						break;
					}
				}
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (!x[i].equals('4'))
			{
				ou(x, n, c, d);
			}
		}
	}
	public static int Main()
	{
		int i;
		int n;
		String x = new String(new char[1000]);
		char c;
		char d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		c = x.charAt(0);
		n = x.length();
		for (i = 0;i < n - 1;i++)
		{
			if (x.charAt(i) != c)
			{
				d = x.charAt(i);
			}
		}

		ou(x, n, c, d);
		return 0;

	}
}

