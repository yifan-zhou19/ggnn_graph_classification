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
		int i;
		int j;
		int[] a = new int[100];
		int[][] b = new int[100][100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] == 0)
			{
			}
			else
			{
				for (j = 0;j < a[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < a[i];j++)
				{
					if ((b[i][j] + 3 * j) >= 60)
					{
						System.out.printf("%d\n",60 - 3 * j);
						break;
					}
					else if (((b[i][j] + 3 * j) >= 57) && ((b[i][j] + 3 * j) < 60))
					{
						System.out.printf("%d\n",b[i][j]);
						break;
					}
					else
					{
						if (j == a[i] - 1)
						{
							System.out.printf("%d\n",57 - 3 * j);
						}
					}
				}
			}
		}
		return 0;
	}

}

