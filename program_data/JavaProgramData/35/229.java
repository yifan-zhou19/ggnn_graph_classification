package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int h;
		int l;
		int i;
		int j;
		int k;
		int m = 0;
		int[] n = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			int max = 0;
			for (j = 0;j < l;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					n[i] = j;
				}
			}
		}
		k = 0;
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < h;j++)
			{
				if (a[i][n[i]] >= a[j][n[i]])
				{
					m++;
				}
			}
			if (m == 1)
			{
				System.out.printf("%d+%d\n",i,n[i]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}

}

