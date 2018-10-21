package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int t;
		int[] p = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				k = 60;
				System.out.printf("%d\n",k);
			}
			else if (m != 0)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < m;j++)
				{
					t = 3 * j + p[j];
					if (t >= 60)
					{
						k = p[j];
						System.out.printf("%d\n",p[j]);
						 break;
					}
					else if (t < 60)
					{
						if (j == (m - 1))
						{
							k = 60 - 3 * m;
							System.out.printf("%d\n",k);
						}
						else if (j != (m - 1))
						{
							if (p[j + 1] + 3 * (j + 2) > 60)
							{
								if ((60 - 3 * (j + 1)) >= p[j + 1])
								{
								   k = p[j + 1];
								   System.out.printf("%d\n",k);
								 break;
								}
								else if ((60 - 3 * (j + 1)) < p[j + 1])
								{
								   k = 60 - 3 * (j + 1);
								   System.out.printf("%d\n",k);
								   break;
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

