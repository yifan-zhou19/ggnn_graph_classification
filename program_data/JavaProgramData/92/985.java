package <missing>;

public class GlobalMembers
{
	public static void init()
	{
	int i;
	int j;
	int k;
	//void qsort(long int a[],int n);
	//void rqsort(long int b[],int n);

	for (i = 0;i < n - 1;i++)
	{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (a[j] > a[k])
					{
						k = j;
					}
				}
					t = a[k];
					a[k] = a[i];
					a[i] = t;
	}


	 for (i = 0;i < n - 1;i++)
	 {
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (b[j] > b[k])
					{
						k = j;
					}
				}
					t = b[k];
					b[k] = b[i];
					b[i] = t;
	 }




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
	public static void qsort(int[] a, int n)
	{

	int t;
	int j;
	int i;
	int k;
			for (i = 0;i < n - 1;i++)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (a[j] < a[k])
					{
						k = j;
					}
				}
					t = a[k];
					a[k] = a[i];
					a[i] = t;
			}

	}
	public static void rqsort(int[] b, int n)
	{

	int t;
	int j;
	int i;
	int k;
			for (i = 0;i < n - 1;i++)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (a[j] > a[k])
					{
						k = j;
					}
				}
					t = a[k];
					a[k] = a[i];
					a[i] = t;
			}

	}
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[][] l = new int[1000][1000];
	public static int[][] r = new int[1000][1000];
	public static int m;
	public static int j;
	public static int n;
	public static int t;

	public static void Main()
	{
		int i;
		int j;
		int t = 0;
		for (i = 0;i < 1000;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		t++;

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

		r[0][t] = l[0][n - 1] * 200;
		}
		for (i = 1;i <= t;i++)
		{
		System.out.printf("%ld\n",r[0][i]);
		}
	}



}

