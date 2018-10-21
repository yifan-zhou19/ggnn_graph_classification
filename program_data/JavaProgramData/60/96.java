package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i = i + 2)
		{
			k = 0;
			m = Math.sqrt(i + 2);
			for (j = 3;j <= m;j += 2)
			{
				if (i % j == 0)
				{
					k = 1;
							break;
				}
				if ((i + 2) % j == 0)
				{
					k = 1;
								break;
				}
			}
				if (k == 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
					flag = 1;
				}

		}

		if (flag == 0)
		{
			System.out.print("empty");
		}
	}

}

