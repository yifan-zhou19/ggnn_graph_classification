package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int n;
		int m;
		int t;
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
			  for (j = 0;j < 5;j++)
			  {
				 t = a[n][j];
				 a[n][j] = a[m][j];
				 a[m][j] = t;
			  }
			}
			for (i = 0;i < 5;i++)
			{
			  for (j = 0;j < 4;j++)
			  {
				 System.out.printf("%d ",a[i][j]);
			  }
			  System.out.printf("%d\n",a[i][4]);
			}

		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}




}

