package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int all;
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
			for (i = 3;i <= n - 2;i += 2)
			{
				m = 0;
				all = 0;
				for (j = 3;j < i / 2;j++)
				{
					if (i % j != 0)
					{
						m++;
					}
					all++;
				}
				if (m == all)
				{
					m = 0;
					all = 0;
					for (j = 3;j < (i + 2) / 2;j++)
					{
						if ((i + 2) % j != 0)
						{
							m++;
						}
						all++;
					}
					if (m == all)
					{
						System.out.printf("%d %d\n",i,i + 2);
					}
				}
			}

		}
	}
}

