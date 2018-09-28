package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		int i;
		int j;
		int temp = 0;
		int x1;
		int x2;
		int y1;
		int y2;
		int count;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		count = 0;
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y1 - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Integer.parseInt(tempVar3);
				}
				a[i][j] = temp;
			}
		}


		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i <= x2 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					temp = Integer.parseInt(tempVar6);
				}
				b[i][j] = temp;
			}
		}

		i = 0;
		j = 0;
		while (i <= x1 - 1)
		{
			while (j <= y2 - 1)
			{
				for (q = 0;q <= y1 - 1;q++)
				{
					count = count + a[i][q] * b[q][j];
				}
				c[i][j] = count;
				count = 0;
				j++;
			}
			i++;
			j = 0;
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				if (j < y2 - 1)
				{
					System.out.printf("%d ",c[i][j]);
				}
				else if (j == (y2 - 1))
				{
					System.out.printf("%d\n",c[i][j]);
				}
			}
		}
	}


}

