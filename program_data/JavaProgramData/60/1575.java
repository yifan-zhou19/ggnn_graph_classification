package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x = 0;
		int y = 0;
		int z = 1;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			x = y;
			y = z;
			z = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					z = 0;
				}
			}
			if (x != 0 && z != 0)
			{
				System.out.printf("%d %d\n",i - 2,i);
			}
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

