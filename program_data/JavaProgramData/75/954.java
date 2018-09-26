package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int i = 0;
		int j = 0;
		int max = 0;
		int min = 0;
		int[][] a = new int[2000][2];
		int zuich = 0;
		int k;
		int m;
		for (m = 0;m < 2000;m++)
		{
			a[m][0] = 0;
	a[m][1] = 0;
		}
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j][0] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		j++;
		}
		for (k = 0;k <= j - 1;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k][1] = Integer.parseInt(tempVar2);
			}
			if (k != j)
			{
				c = System.in.read();
			}
		}

	i = j - 1;
		for (j = 0;j < 1000;j++)
		{
			int x = 0;
			for (k = 0;k < i + 1;k++)
			{
				if ((a[k][0] <= j) && (a[k][1]> j))
				{
					 x++;
				}
			}
				if (x >= zuich)
				{
					zuich = x;
				}
		}

		System.out.printf("%d %d",i + 1,zuich);
		return 0;
	}

}

