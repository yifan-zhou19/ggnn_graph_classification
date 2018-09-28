package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int g = 0;
		int t;
		int h;
		int k;
		int l;
		int[][] a = new int[22][22];
		int[] b = new int[100];
		int[] c = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }

	for (i = 1;i <= n;i++)
	{
			 for (j = 1;j <= m;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar3);
				 }
			 }
	}
	   for (i = 1;i <= n;i++)
	   {
			for (j = 1;j <= m;j++)
			{
			   if ((a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]) && (a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]))
			   {
				   b[g] = i - 1;
				c[g] = j - 1;
				g++;
			   }
			}
	   }
	for (l = 0;l < g;l++)
	{
			for (k = 0;k < g - 1;k++)
			{
				if (b[k] > b[k + 1])
				{
					t = b[k];
					b[k] = b[k + 1];
					b[k + 1] = t;
				h = c[k];
				c[k] = c[k + 1];
				c[k + 1] = h;
				}
				if (b[k] == b[k + 1] && c[k] > c[k + 1])
				{
					h = c[k];
					c[k] = c[k + 1];
					c[k + 1] = h;
				}
			}
	}

	for (l = 0;l < g;l++)
	{
		System.out.printf("%d %d\n",b[l],c[l]);
	}

		return 0;
	}

}

