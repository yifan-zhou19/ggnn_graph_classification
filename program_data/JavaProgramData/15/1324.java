package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int j;
		int heng;
		int shu;
		heng = 0;
		shu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					heng++;
				}
				if ((a[i][j] == 0) && (a[i][j + 1] != 0))
				{
					break;
				}
			}
			if ((a[i][j] == 0) && (a[i][j + 1] != 0))
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j][i] == 0)
				{
					shu++;
				}
				if ((a[j][i] == 0) && (a[j + 1][i] != 0))
				{
					break;
				}
			}
			if ((a[j][i] == 0) && (a[j + 1][i] != 0))
			{
				break;
			}
		}
		if (heng != shu)
		{
			System.out.printf("%d\n",Math.abs(heng - shu) + 1);
		}
			 else
			 {
			 System.out.printf("%d\n",(heng - 2) * (heng - 2));
			 }
	return 0;
	}

}

