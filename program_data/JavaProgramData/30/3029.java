package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0)
			{
				c = (i % 100) / 10;
				if (i % 10 != 7)
				{
					if (c != 7)
					{
						sum = sum + i * i;
					}
				}
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

