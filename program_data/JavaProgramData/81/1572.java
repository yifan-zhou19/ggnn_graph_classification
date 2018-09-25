package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int c;
		int[][] b = new int[5][5];
		int[][] e = new int[5][5];
		int cha = new int(int x,int y);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			c = cha(m, n);
		if (c == 1)
		{
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			b[i][j] = a[i][j];
			}
		}
		for (j = 0;j < 5;j++)
		{
		 e[0][j] = b[m][j];
		 b[m][j] = b[n][j];
		 b[n][j] = e[0][j];
		}


			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 4;j++)
			{
			System.out.printf("%d ",b[i][j]);
			}
			System.out.printf("%d\n",b[i][4]);
			}
		}
	else
	{
		System.out.print("error");
	}
	}

	public static int cha(int x,int y)
	{
		int z;
		if (x >= 0 && x <= 4 && y >= 0 && y <= 4)
		{
	   z = 1;
		}
	else
	{
		z = 0;
	}
	return (z);
	}

}

