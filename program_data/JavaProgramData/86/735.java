package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] no = new int[20];
		int i;
		int j;
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
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						no[j] = Integer.parseInt(tempVar3);
					}
				}
				if (no[m - 1] + 3 * m <= 60)
				{
					System.out.printf("%d\n",60 - 3 * m);
				}
				else
				{
					for (j = 0;j < m;j++)
					{
						if (no[j] + 3 * (j + 1) > 63)
						{
							if (no[j - 1] + 3 * j <= 60)
							{
								System.out.printf("%d\n",60 - 3 * j);
							}
							else
							{
								System.out.printf("%d\n",no[j - 1]);
							}
							break;
						}
						if (no[j] + 3 * (j + 1) > 60 && no[j] + 3 * (j + 1) <= 63)
						{
							System.out.printf("%d\n",no[j]);
							break;
						}
					}
				}

			}
		}
		return 0;
	}
}

