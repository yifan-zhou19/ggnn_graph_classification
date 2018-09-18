package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int sum(int n)
	{
		int i;
		int j;
		int x;
		int t;
		int p;
		int q;
		if (n == 1)
		{
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			x = 32767;
			for (j = 0;j < n;j++)
			{
			   if (x > *(*(a + i) + j))
			   {
				   x = (*(a + i) + j);
			   }
			}
			if (x != 0)
			{
			for (j = 0;j < n;j++)
			{
			   (*(*(a + i) + j)) -= x;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			x = 32767;
			for (j = 0;j < n;j++)
			{
			   if (x > *(*(a + j) + i))
			   {
				   x = (*(a + j) + i);
			   }
			}
			if (x != 0)
			{
			for (j = 0;j < n;j++)
			{
			   (*(*(a + j) + i)) -= x;
			}
			}
		}
			t = (*(a + 1) + 1);
		for (i = 1;i < n - 1;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			  *(*(a + i) + j) = *(*(a + i + 1) + j);
		   }
		}
		for (i = 1;i < n - 1;i++)
		{
		   for (j = 0;j < n - 1;j++)
		   {
			  *(*(a + j) + i) = *(*(a + j) + i + 1);
		   }
		}
		return (t + sum(n - 1));
	}
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			   for (p = 0;p < n;p++)
			   {
			   for (q = 0;q < n;q++)
			   {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a[p][q] = Integer.parseInt(tempVar2);
				   }
			   }
			   }
			System.out.printf("%d\n",sum(n));
		}
		return 0;
	}

}

