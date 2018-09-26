package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int k;
		int e;
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
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			for (k = 0;k < 5;k++)
			{
				e = a[m][k];
				a[m][k] = a[n][k];
				a[n][k] = e;
			}

		 for (i = 0;i < 5;i++)
		 {
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",a[i][j]);
				}
				if (j > 0 && j < 4)
				{
					System.out.printf(" %d",a[i][j]);
				}
				if (j == 4)
				{
					System.out.printf(" %d\n",a[i][j]);
				}
			}

		 }
		}
		else
		{
			System.out.print("error");
		}



		return 0;
	}

}

