package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int k;
		  int l;
		  int sum;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a = new int[100000][2];
		   for (i = 0;i < 100000;i++)
		   {
			  for (j = 0;j < 2;j++)
			  {
			  a[i][j] = 0;
			  }
		   }

		  for (i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a[i][0] = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   a[i][1] = Integer.parseInt(tempVar3);
					   }
					   if (a[i][0] == 0 && a[i][1] == 0)
					   {
					   break;
					   }
		  }
		  int[] c = new int[n];
		  for (j = 0;j < n;j++)
		  {
		  c[j] = 0;
		  }
		  for (k = 0;k <= i - 1;k++)
		  {
						b = a[k][1];
						c[b]++;
		  }
		  sum = 0;
		  for (j = 0;j <= n - 1;j++)
		  {
							if (c[j] == n - 1)
							{
								 System.out.printf("%d",j);
								 sum++;
							}
		  }
		  if (sum == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
	}

}

