package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int z;
		int m;
		int sum = 0;
		int lum = 0;
		int kum = 0;
	int[] duan = new int[1000];
	int[][] cishu = new int[50][100];
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
			duan[i] = Integer.parseInt(tempVar2);
		}
		for (p = 0;p < duan[i];p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cishu[i][p] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (z = 0;z < n;z++)
	{
		if (duan[z] == 0)
		{
			System.out.print("60\n");
		}
	else
	{
		for (m = 1;m <= duan[z];m++)
		{
				if ((m * 3 + cishu[z][m - 1]) <= 60)
				{
					if (m == duan[z])
					{
						lum = 60 - 3 * m;
					System.out.printf("%d\n",lum);
					}
					else
					{
						continue;
					}
				}
			if (((m * 3 + cishu[z][m - 1]) > 60) && ((m * 3 - 3 + cishu[z][m - 1]) <= 60))
			{
					System.out.printf("%d\n",cishu[z][m - 1]);
			}
			if (((m * 3 + cishu[z][m - 1]) > 60) && ((m * 3 - 3 + cishu[z][m - 1]) > 60))
			{
					kum = 60 - m * 3 + 3;
				System.out.printf("%d\n",kum);
				break;
			}
		}
	}

	}
	return 0;
	}
}

