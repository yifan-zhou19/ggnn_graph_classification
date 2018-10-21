package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int change = new int(int a[100][100],int);
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
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
			System.out.printf("%d\n",change(a, n));
		}
	}
	public static int change(int[][] a, int n)
	{
		int i;
		int j;
		int s;
		int[][] b = new int[100][100];
		int f;
		for (i = 0;i < n;i++)
		{
			s = a[i][0];
			for (j = 0;j < n;j++)
			{
				s = (s > a[i][j])?a[i][j]:s;
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - s;
			}
		}
		for (i = 0;i < n;i++)
		{
			s = a[0][i];
			for (j = 0;j < n;j++)
			{
				s = (s > a[j][i])?a[j][i]:s;
			}
			for (j = 0;j < n;j++)
			{
				a[j][i] = a[j][i] - s;
			}
		}
		f = a[1][1];
		if (n > 2)
		{
		b[0][0] = a[0][0];
		for (i = 2;i < n;i++)
		{
			b[0][i - 1] = a[0][i];
			b[i - 1][0] = a[i][0];
		}
		for (i = 2;i < n;i++)
		{
			for (j = 2;j < n;j++)
			{
				b[i - 1][j - 1] = a[i][j];
			}
		}
		f = f + change(b, n - 1);
		}
		return f;
	}







}

