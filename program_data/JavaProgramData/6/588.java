package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int sum;
		int b;
		int n;
		int m;
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (l = 0;l < b;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
			  for (j = 0;j < n;j++)
			  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar4);
				  }
			  }
			}
			sum = 0;
			if (m == 1 && n != 1)
			{
			  for (j = 0;j < n;j++)
			  {
				  sum += a[0][j];
			  }
			  System.out.printf("%d\n",sum);
			}
			if (n == 1 && m != 1)
			{
			  for (i = 0;i < m;i++)
			  {
				  sum += a[0][1];
			  }
			  System.out.printf("%d\n",sum);
			}
			if (m == 1 && n == 1)
			{
				System.out.printf("%d\n",a[0][0]);
			}
			if (m > 1 && n > 1)
			{
			sum = 0;
			for (j = 1;j < n - 1;j++)
			{
				sum += a[0][j] + a[m - 1][j];
			}
			for (i = 1;i < m - 1;i++)
			{
				sum += a[i][0] + a[i][n - 1];
			}
			sum = sum + a[0][0] + a[0][n - 1] + a[m - 1][0] + a[m - 1][n - 1];
			System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}

}

