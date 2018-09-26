package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int n = 13;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		for (i = 1;i <= 12;i++)
		{
			m = 0;
			n += d[i - 1];
			m = n % 7 + w - 1;
			if (m > 7)
			{
				m = m % 7;
			}
			if (m == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}

}

