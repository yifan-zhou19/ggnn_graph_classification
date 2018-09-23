package <missing>;

public class GlobalMembers
{
	public static int tozero(int n)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			delete1(i, n);
		}
		for (i = 0;i < n;i++)
		{
			delete2(i, n);
		}
		sum += *(*(a + 1) + 1);
		movea(n);
		if (n >= 3)
		{
			tozero(n - 1);
		}
		return sum;
	}
	public static void delete1(int r, int n)
	{
		int min = (*(a + r) + 0);
		int j;
		for (j = 0;j < n;j++)
		{
			if (*(*(a + r) + j) < min)
			{
				min = (*(a + r) + j);
			}
		}
		for (j = 0;j < n;j++)
		{
			*(*(a + r) + j) -= min;
		}
	}
	public static void delete2(int l, int n)
	{
		int min = (*(a + 0) + l);
		int j;
		for (j = 0;j < n;j++)
		{
			if (*(*(a + j) + l) < min)
			{
				min = (*(a + j) + l);
			}
		}
		for (j = 0;j < n;j++)
		{
			*(*(a + j) + l) -= min;
		}
	}
	public static void movea(int n)
	{
		int i;
		int j;
		int k;
		for (i = 1;i < n - 1;i++)
		{
			*(*(a + 0) + i) = *(*(a + 0) + i + 1);
		}
		for (i = 1;i < n - 1;i++)
		{
			*(*(a + i) + 0) = *(*(a + i + 1) + 0);
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 2;j < n;j++)
			{
				*(*(a + i) + j) = *(*(a + i + 1) + j);
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				*(*(a + j) + i) = *(*(a + j) + i + 1);
			}
		}
	}
	public static int[][] a = new int[100][100];
	public static int sum = 0;
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 99;j++)
			{
				for (k = 0;k <= 99;k++)
				{
					*(*(a + j) + k) = 0;
				}
			}
			int r;
			int l;
			int lim = 99;
			char c;

			for (r = 0;r < n;r++)
			{
				for (l = 0;l < n;l++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					*(a + r) + l = tempVar2;
				}


				}
			}
			sum = tozero(r);
			System.out.printf("%d\n",sum);
			sum = 0;
		}
	}
}

