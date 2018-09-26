package <missing>;

public class GlobalMembers
{
	public static int mon(int m)
	{
		int y;
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			y = 31;
		}
		else if (m == 2)
		{
			y = 28;
		}
		else
		{
			y = 30;
		}
		return (y);
	}

	public static int Main()
	{
		int w;
		int ww;
		int i = 13;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (m = 1 ; m <= 12 ; m = m + 1)
		{
			ww = (i - 1 + w) % 7;
			if (ww == 5)
			{
				System.out.printf("%d\n", m);
			}
			i = i + mon(m);
		}
		return (0);
	}
}

