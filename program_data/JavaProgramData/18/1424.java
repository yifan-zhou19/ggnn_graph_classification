package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ml = new int(int a[101],int m);
		void guiling(int a[101][101],int m);
		void xiaojian(int a[101][101],int m);
		int n;
		int i;
		int j;
		int k;
		int sum;
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				 for (k = 0;k < n;k++)
				 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[j][k] = Integer.parseInt(tempVar2);
				 }
				 }
			 }
			 sum = 0;
			 for (j = n;j > 1;j--)
			 {

				 guiling(a, j);
				 sum = sum + a[1][1];
				 xiaojian(a, j);

			 }
			 System.out.printf("%d\n",sum);
		}

		return 0;
	}

	public static int ml(int[] a, int m)
	{
		int i;
		int n = a[0];
		for (i = 0;i < m;i++)
		{
			if (a[i] < n)
			{
				n = a[i];
			}
		}
		return n;
	}

	public static void guiling(int[][] a, int m)
	{
		int ml = new int(int a[101],int m);
		int i;
		int j;
		int minc;
		int minl;
		for (i = 0;i < m;i++)
		{
			minl = ml(a[i], m);
			for (j = 0;j < m;j++)
			{
				 a[i][j] = a[i][j] - minl;
			}
		}
		for (j = 0;j < m;j++)
		{
			minc = a[0][j];
			for (i = 0;i < m;i++)
			{
				if (a[i][j] < minc)
				{
					minc = a[i][j];
				}
			}
			for (i = 0;i < m;i++)
			{
				a[i][j] = a[i][j] - minc;
			}
		}
	}

	public static void xiaojian(int[][] a, int m)
	{
		int i;
		int j;
		if (m > 1)
		{
			for (i = 0;i < m;i++)
			{
				for (j = 1;j < m - 1;j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			for (j = 0;j < m - 1;j++)
			{
				for (i = 1;i < m - 1;i++)
				{
					a[i][j] = a[i + 1][j];
				}
			}
		}
	}
}

