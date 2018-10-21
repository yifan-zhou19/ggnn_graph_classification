package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];
		int l = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				for (k = 0;k < lie;k++)
				{
					if (a[i][k] > a[i][j])
					{
						break;
					}
					if (k == lie-1)
					{
						for (p = 0;p < hang;p++)
						{
							if (a[p][j] < a[i][j])
							{
								break;
							}
							if (p == hang - 1)
							{
								System.out.printf("%d+%d",i,j);
								l++;
							}
						}
					}
				}
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

