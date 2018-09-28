package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] fake = new int[100];
		int[][] count = new int[100][100];
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
				fake[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < fake[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					count[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (fake[i] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < fake[i];j++)
				{
					if ((count[i][j] + (j + 1) * 3) >= 60)
					{
						if (count[i][j] < (60 - 3 * j))
						{
							System.out.printf("%d\n", count[i][j]);
							break;
						}
						else
						{
							if (j != 0)
							{
								System.out.printf("%d\n", 60 - 3 * j);
								break;
							}
							else
							{
								System.out.print("60\n");
								break;
							}
						}
					}
					k += 1;
				}
				if (k == fake[i])
				{
				System.out.printf("%d\n", 60 - 3 * fake[i]);
				}
				k = 0;
			}
		}
	}
}

