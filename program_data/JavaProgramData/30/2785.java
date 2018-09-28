package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			if ((i - 7) % 10 == 0)
			{
				continue;
			}
			if (i / 10 == 7)
			{
				continue;
			}
				a = a + i * i;
		}
		System.out.printf("%d", a);
		return 0;
	}

}

