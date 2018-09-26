package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] v = new int[100][100];
		int z;
		int d;
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
	 for (int i = 0;i <= m - 1;i++)
	 {
		   for (int j = 0;j <= n - 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   (v[i][j]) = Integer.parseInt(tempVar3);
			   }
		   }
	 }


	int p = 0;
	int u = n;
	if (m > n)
	{
		u = m;
	}
	for (int i = 0;i <= u;i++)
	{
		  for (int d = i;d <= n - i - 1;d++)
		  {
			System.out.printf("%d\n",v[i][d]);
			 p++;
			 if (p == m * n)
			 {
				 break;
			 }
		  }
		  for (int a = i + 1;a <= m - i - 1;a++)
		  {
			 System.out.printf("%d\n",v[a][n - 1 - i]);
			  p++;
			  if (p == m * n)
			  {
				  break;
			  }
		  }
		  if (p == m * n)
		  {
			  break;
		  }
		  for (int b = n - i - 2;b >= i;b--)
		  {
			System.out.printf("%d\n",v[m - i - 1][b]);
			p++;
			if (p == m * n)
			{
				break;
			}
		  }
		   if (p == m * n)
		   {
			   break;
		   }
		 for (int c = m - i - 2;c >= i + 1;c--)
		 {
			System.out.printf("%d\n",v[c][i]);
		   p++;
		   if (p == m * n)
		   {
			   break;
		   }
		 }
		 if (p == m * n)
		 {
			 break;
		 }
	}
	return 0;

	}
}

