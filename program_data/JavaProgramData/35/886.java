package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h;
		int l;
		int i;
		int j;
		int k;
		int p = 0;
		int n = 0;
		int[][] a = new int[8][8];
		int[] c = new int[8];
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
			for (j = 0;j < l;j++)
			{
				p = 0;
				for (k = 0;k < l;k++)
				{
					if (a[i][j] >= a[i][k])
					{
						p++;
					}
				}
				if (p == l)
				{
					c[i] = j;
				}
			}
		}
		for (i = 0;i < h;i++)
		{
			p = 0;
			for (k = 0;k < h;k++)
			{
				j = c[i];
				if (a[i][j] <= a[k][j])
				{
					p++;
				}
			}
			if (p == h)
			{
				System.out.printf("%d+%d\n",i,j);
				n++;
			}


		}
		if (n == 0)
		{
			System.out.print("No");
		}


	}
}

