package <missing>;

public class GlobalMembers
{
	public static void xiao(int[][] a, int n)
	{
		int min;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			min = a[i][0];
			for (j = 0;j < n;j++)
			{
			if (a[i][j] < min)
			{
				min = a[i][j];
			}
			}
			if (min > 0)
			{
			for (j = 0;j < n;j++)
			{
			a[i][j] = a[i][j] - min;
			}
			}
		}

		for (j = 0;j < n;j++)
		{
			min = a[0][j];
		   for (i = 0;i < n;i++)
		   {
			if (a[i][j] < min)
			{
				min = a[i][j];
			}
		   }
			if (min > 0)
			{
			for (i = 0;i < n;i++)
			{
			a[i][j] = a[i][j] - min;
			}
			}
		}
	}
	public static void move(int[][] a, int n)
	{
		  int i;
		  int j;
	  for (i = 0;i < n;i++)
	  {
		  for (j = 2;j < n;j++)
		  {
			  a[i][j - 1] = a[i][j];
		  }
	  }
		  for (j = 0;j < n;j++)
		  {
			  for (i = 2;i < n;i++)
			  {
				  a[i - 1][j] = a[i][j];
			  }
		  }
	}


	public static int count(int[][] a, int n, int s)
	{
		if (n == 1)
		{
			return (s);
		}
		else
		{
			xiao(a, n);
			  s = s + a[1][1];
			  move(a, n);
			  return (count(a, n - 1, s));
		}

	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int t;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		while (t > 0)
		{
			s = 0;
		   for (i = 0;i < n;i++)
		   {
		   for (j = 0;j < n;j++)
		   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar2);
		   }
		   }
		   }
		   System.out.printf("%d\n",count(a, n, s));
		   t--;
		}
	}



}

