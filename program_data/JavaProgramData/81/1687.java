package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] jz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					jz[i][j] = Integer.parseInt(tempVar);
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jz[i][4] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
			if (n > 4 || m > 4)
			{
				System.out.print("error");
			}
			else
			{
		if (n > m)
		{
			k = n;
			n = m;
			m = k;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",jz[i][j]);
			}
			System.out.printf("%d\n",jz[i][4]);
		}
		for (j = 0;j < 4;j++)
		{
			System.out.printf("%d ",jz[m][j]);
		}
		System.out.printf("%d\n",jz[m][4]);
		for (i = n + 1;i < m;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",jz[i][j]);
			}
			System.out.printf("%d\n",jz[i][4]);
		}
		for (j = 0;j < 4;j++)
		{
			System.out.printf("%d ",jz[n][j]);
		}
		System.out.printf("%d\n",jz[n][4]);
		for (i = m + 1;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",jz[i][j]);
			}
			System.out.printf("%d\n",jz[i][4]);
		}
			}
		return 0;
	}


}

