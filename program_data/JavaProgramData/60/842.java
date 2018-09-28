package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int z = 0;
		for (int i = 3;i <= n;i++)
		{
			int x = 0;
			int y = 0;
			for (int j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					x = x + 1;
				}
			}
			if (x == 0 && (i + 2) <= n)
			{
				for (int k = 2;k < i + 2;k++)
				{
					if ((i + 2) % k == 0)
					{
						y = y + 1;
					}
				}
				if (y == 0)
				{
					z = z + 1;
					if (i == 3)
					{
						System.out.printf("%d %d",i,i + 2);
					}
					else
					{
						System.out.printf("\n%d %d",i,i + 2);
					}
				}
			}
		}
		if (z == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}



}

