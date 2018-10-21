package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i % 10 == 7 || (int)(i / 10) == 7)
			{
				continue;
			}
			else
			{
				 sum = sum + i * i;
			}
		}
		System.out.printf("%d", sum);
		return 0;
	}

}

