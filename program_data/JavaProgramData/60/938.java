package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			for (k = 2;k <= i;k++)
			{
				if (i % k == 0)
				{
					break;
				}
			}
			if (k == i)
			{
				for (k = 2;k <= i + 2;k++)
				{
					if ((i + 2) % k == 0)
					{
						break;
					}
				}
				if (k == i + 2)
				{
					a = 1;
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		if (a == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

