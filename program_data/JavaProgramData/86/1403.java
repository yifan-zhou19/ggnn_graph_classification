package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] sz = new int[100];
		int i;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
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
				for (i = 0;i < m;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[i] = Integer.parseInt(tempVar3);
					}
				}

				if (sz[m - 1] + 3 * (m) <= 60)
				{
					result = 60 - (sz[m - 1] + 3 * (m)) + sz[m - 1];
					System.out.printf("%d\n",result);
				}

				else if (sz[m - 1] + 3 * m > 60 && sz[m - 1] + 3 * m <= 63)
				{
					System.out.printf("%d\n",sz[m - 1]);
				}

				else
				{
					for (i = m - 2;i >= 0;i--)
					{
						if (sz[i] + 3 * (i + 1) <= 60)
						{
							System.out.printf("%d\n",60 - (sz[i] + 3 * (i + 1)) + sz[i]);
							break;
						}
						if (sz[i] + 3 * (i + 1) > 60 && sz[i] + 3 * (i + 1) <= 63)
						{
							System.out.printf("%d\n",sz[i]);
							break;
						}
					}
				}


			}
		}

		return 0;
	}
}

