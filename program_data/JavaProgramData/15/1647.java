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
		int[][] a = new int[100][100];
		int i;
		int j;
		int[] chang1 = new int[100];
		int kuan;
		int chang = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0,chang1[i] = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					chang1[i] = chang1[i] + 1;
				}
			}
		}
		int yo;
		for (yo = 0;yo < n;yo++)
		{
			if (chang1[yo] != 0)
			{
				chang = chang1[yo];
			break;
			}
		}
		int t;
		for (t = 0,kuan = 0;t < n;t++)
		{
			if (chang1[t] == 2)
			{
				kuan = kuan + 1;
			}
		}
		int jieguo;
		jieguo = kuan * (chang - 2);
		System.out.printf("%d",jieguo);
		return 0;
	}



}

