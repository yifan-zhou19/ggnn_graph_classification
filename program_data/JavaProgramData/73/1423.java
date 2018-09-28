package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int g;
		int n;
		int m;
		int k;
		int x;
		int h;
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int[] c = new int[5];
		int[] d = new int[5];
		int[] e = new int[5];
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
		for (i = 0;i < 5;i++)
		{
		g = 0;
			for (j = 0;j < 5;j++)
			{
			   if (a[i][j] > g)
			   {
				  g = a[i][j];

				  b[i] = i;
				  c[i] = j;
			   }
			}
		}
		for (j = 0;j < 5;j++)
		{
		h = 1000000;
			for (i = 0;i < 5;i++)
			{
			   if (a[i][j] < h)
			   {
				  h = a[i][j];
				  d[j] = i;
				  e[j] = j;
			   }
			}
		}
		x = 0;
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
			   if (b[i] == d[j] && c[i] == e[j])
			   {
			   m = b[i];
			   n = c[i];
			   System.out.printf("%d %d %d",m + 1,n + 1,a[m][n]);
			   x = 1;
			   }
			}
		}
			if (x == 0)
			{
			   System.out.print("not found");
			}
		return 0;
		}

}

