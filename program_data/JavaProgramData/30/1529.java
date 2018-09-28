package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0)
			{
				if (i % 10 != 7)
				{
					if (i >= 10 && ((i / 10) % 7) != 0)
					{
						//printf("%d ",i);
						k = k + i * i;
					}
					if (i < 10)
					{
						//printf("%d ",i);
						k = k + i * i;
					}
				}
			}
		}
		System.out.printf("%d\n",k);

	}

}

