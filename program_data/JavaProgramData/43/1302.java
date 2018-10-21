package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			for (j = 2;j <= m;j++)
			{
			t = 0;
			if (((m - i) != j) && (i != j) && ((i % j == 0) || ((m - i) % j == 0)))
			{
				t = 1;
				break;
			}
			}
		if (t == 0)
		{
			System.out.printf("%d %d\n",i,m - i);
		}
		}

	return 0;
	}
}

