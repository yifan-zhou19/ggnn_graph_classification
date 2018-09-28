package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[200][200];
		int m;
		int n;
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		  }
		}

		i = 0;
		j = 0;
		for (x = 0;x <= m + n - 2;x++)
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (i + j == x)
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}



	}
}

