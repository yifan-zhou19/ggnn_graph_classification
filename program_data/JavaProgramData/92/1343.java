package <missing>;

public class GlobalMembers
{
	public static void readdata()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.exit(0);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
	}
	public static void init()
	{
		int i;
		sort(a, n);
		sort(b, n);
		for (i = 0;i < n;i++)
		{
			if (a[i] < b[0])
			{
				l[i][0] = 1;
			}
			else if (a[i] == b[0])
			{
				l[i][0] = 0;
			}
			else
			{
				l[i][0] = -1;
			}
		}
	}
	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int n;
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[][] l = new int[1000][1000];
	public static int Main()
	{
		int i;
		int j;
		while (true)
		{
			readdata();
			init();
			for (i = n - 2;i >= 0;i--)
			{
				for (j = 1;j < n - i;j++)
				{
					if (a[i + j] < b[j])
					{
						l[i][j] = l[i][j - 1] + 1;
					}
					else if (a[i + j] > b[j])
					{
						l[i][j] = l[i + 1][j - 1] - 1;
					}
					else if (l[i + 1][j - 1] - 1 > l[i][j - 1])
					{
						l[i][j] = l[i + 1][j - 1] - 1;
					}
					else
					{
						l[i][j] = l[i][j - 1];
					}
				}
			}
			System.out.printf("%d\n",l[0][n - 1] * 200);
		}
	}



}

