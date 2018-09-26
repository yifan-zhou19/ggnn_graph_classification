package <missing>;

public class GlobalMembers
{
	public static int month(int m)
	{
		if (m == 0)
		{
			return 0;
		}
		else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
		{
			return 31;
		}
		else if (m == 2)
		{
			return 28;
		}
		else if (m == 4 || m == 6 || m == 9 || m == 11)
		{
			return 30;
		}
	}
	public static int Main()
	{
		int w;
		int m;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (m = 0;m < 12;m++)
		{
			result += month(m);
			if ((w + result) % 7 == 0)
			{
				System.out.printf("%d\n",m + 1);
			}
		}
		return 0;
	}
}

