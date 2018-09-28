package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] x = new int[50000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < 2;j++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i][j] = Integer.parseInt(tempVar2);
			}
		  }
		}
		int[][] y = new int[50000][2];
		int max;
		int min;
		for (i = 0;i < n;i++)
		{
		  y[i][0] = x[i][0];
		  y[i][1] = x[i][1];
		}
		for (i = 0;i < n - 1;i++)
		{
		  if (i == n - 2)
		  {
			min = (y[i][0]) <= (y[i + 1][0])?y[i][0]:y[i + 1][0];
		  }
		  if ((y[i][0]) <= (y[i + 1][0]))
		  {
			min = y[i][0];
			y[i][0] = y[i + 1][0];
			y[i + 1][0] = min;
		  }
		}
		for (i = 0;i < n - 1;i++)
		{
		  if (i == n - 2)
		  {
			max = (y[i][1]) >= (y[i + 1][1])?y[i][1]:y[i + 1][1];
		  }
		  if ((y[i][1]) >= (y[i + 1][1]))
		  {
			max = y[i][1];
			y[i][1] = y[i + 1][1];
			y[i + 1][1] = max;
		  }
		}
		int k = 1;
		int maxmax;
		int minmin;
		int maxmin;
		int minmax;
		if (n == 2)
		{
		  maxmax = (x[0][1]) >= (x[1][1])?(x[0][1]):(x[1][1]);
		  minmin = (x[0][0]) <= (x[1][0])?(x[0][0]):(x[1][0]);
		  maxmin = (x[0][1]) < (x[1][1])?(x[0][1]):(x[1][1]);
		  minmax = (x[0][0]) > (x[1][0])?(x[0][0]):(x[1][0]);
		  if (maxmin >= minmax)
		  {
			System.out.printf("%d %d",minmin,maxmax);
		  }
		  if (maxmin < minmax)
		  {
			System.out.print("no");
		  }
		}
		if (n > 2)
		{
		while (k < n)
		{
		for (i = 0;i < n - 1;i++)
		{
		  maxmax = (x[i][1]) >= (x[i + 1][1])?(x[i][1]):(x[i + 1][1]);
		  minmin = (x[i][0]) <= (x[i + 1][0])?(x[i][0]):(x[i + 1][0]);
		  maxmin = (x[i][1]) < (x[i + 1][1])?(x[i][1]):(x[i + 1][1]);
		  minmax = (x[i][0]) > (x[i + 1][0])?(x[i][0]):(x[i + 1][0]);
		  if (i == n - 2)
		  {
			if (maxmin >= minmax)
			{
			x[0][0] = minmin;
			x[0][1] = maxmax;
			break;
			}
			if (maxmin < minmax)
			{
			 int p = x[i + 1][0];
			 int q = x[i + 1][1];
			 x[0][0] = x[i][0];
			 x[0][1] = x[i][1];
			 x[i][0] = p,x[i][1] = q;
			 break;
			}
		  }
		  if (i < n - 2 && maxmin >= minmax)
		  {
			x[i + 1][0] = minmin;
			x[i + 1][1] = maxmax;
		  }
		  if (i < n - 2 && maxmin < minmax)
		  {
		  int p = x[i + 1][0];
		  int q = x[i + 1][1];
		  x[i + 1][0] = x[i][0];
		  x[i + 1][1] = x[i][1];
		  x[i][0] = p,x[i][1] = q;
		  }
		}
		k++;
		if (min == x[0][0] && max == x[0][1])
		{
		  System.out.printf("%d %d",min,max);
		  break;
		}
			 if (k == n - 1)
			 {
		if (min != x[0][0] || max != x[0][1])
		{
			System.out.print("no");
			break;
		}
			 }
		}
		}
		return 0;
	}
}

