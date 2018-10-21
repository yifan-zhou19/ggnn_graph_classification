package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int spp = int p;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 2;i < n;i++)
			{
				if (spp(i) == 0)
				{
					if (spp(i + 2) == 0)
					{
						System.out.printf("%d %d\n",i,i + 2);
					}
					else
					{
						continue;
					}
				}
			}
		}
		return 0;
	}
	public static int spp(int p)
	{
		int j;
		int k = 0;
		for (j = 2;j < p;j++)
		{
		if (p % j == 0)
		{
			k = 1;
		}
		}
		return (k);
	}

}

