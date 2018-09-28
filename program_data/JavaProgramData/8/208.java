package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2][100];
	public static int n;
	public static int m;
	public static int[] b = new int[200];

	public static void read()
	{
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
		int i = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0][i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[1][j] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void sort()
	{
		int k = 0;
		int l;
		int min;
		int temp;
		for (k = 0;k < n;k++) //??????
		{
			min = a[0][k];
			for (l = k + 1;l < n;l++)
			{
				if (a[0][l] < min)
				{
					temp = min;
					min = a[0][l];
					a[0][k] = min;
					a[0][l] = temp;
				}
			}
		}
		k = 0;
		for (k = 0;k < m;k++) //??????
		{
			min = a[1][k];
			for (l = k + 1;l < m;l++)
			{
				if (a[1][l] < min)
				{
					temp = min;
					min = a[1][l];
					a[1][k] = min;
					a[1][l] = temp;
				}
			}
		}
	}

	public static void merge()
	{
		int i = 0;
		int j = n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[0][i];
		}
		for (j = n;j < n + m;j++)
		{
			b[j] = a[1][j - n];
		}
	}

	public static void out()
	{
		int i = 0;
		for (i = 0;i < n + m;i++)
		{
			if (i < n + m - 1)
			{
				System.out.printf("%d ",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
		}
	}

	public static void Main()
	{
		read();
		sort();
		merge();
		out();
	}
}

