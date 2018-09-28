package <missing>;

public class GlobalMembers
{
	public static int comp(int point, int up, int down, int left, int right)
	{
		  if ((point >= up) && (point >= down) && (point >= left) && (point >= right))
		  {
			  return 1;
		  }
		  else
		  {
			  return 0;
		  }
	}
	public static int Main()
	{
		int[][] a = new int[22][22];
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < m + 2; j++)
		{
			a[j][0] = -1;
			a[j][n + 1] = -1;
		} // ?????
		for (k = 1;k < n + 1; k++)
		{
			a[0][k] = -1;
			a[m + 1][k] = -1;
		} // ?????
		for (j = 1;j < m + 1; j++)
		{
					   for (k = 1;k < n + 1;++k)
					   {
										 String tempVar3 = ConsoleInput.scanfRead();
										 if (tempVar3 != null)
										 {
											 a[j][k] = Integer.parseInt(tempVar3);
										 }
					   }
		}
		for (j = 1;j < m + 1; j++)
		{
					   for (k = 1;k < n + 1;++k)
					   {
										 if (comp(a[j][k], a[j - 1][k], a[j + 1][k], a[j][k - 1], a[j][k + 1]) == 1)
										 {
										 System.out.printf("%d %d\n",j - 1,k - 1);
										 }
					   }
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

