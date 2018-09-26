package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int M = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i < 10)
			{
				if (i != 7)
				{
					M = M + i * i;
				}
				else
				{
					M = M + 0;
				}
			}
			else
			{
				int a = i % 10;
				int b = (i - a) / 10;
				if (a != 7 && b != 7 && i % 7 != 0)
				{
					M = M + i * i;
				}
				else
				{
					M = M + 0;
				}
			}
		}
		System.out.printf("%d\n",M);
		return 0;
	}
}

