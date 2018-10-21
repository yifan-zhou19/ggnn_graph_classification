package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		int max;
		int b;
		int q = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
		for (i = 0;i < m;i++)
		{
			max = a[i][0];
					b = 0;
			for (j = 0;j < n;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					b = j;
				}
			}
		  for (j = 0;j < m;j++)
		  {
					   if (max > a[j][b])
					   {
				q = 1;
					   }
		  }

						if (q == 0)
						{
						   System.out.printf("%d+%d",i,b);
						f = 1;
						}
		}
						if (f == 0)
						{
							  System.out.print("No\n");
						}
				  return 0;
	}
}

