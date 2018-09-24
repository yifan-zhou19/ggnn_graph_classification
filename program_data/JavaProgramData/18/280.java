package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static int findmin(int * a, int n, int step)
	{
		int min = 32767;
		while (n > 0)
		{
			if (min > *a)
			{
				min = a;
			}
			a += step;
			n--;
		}
		return min;
	}

	public static void Main()
	{
		int n;
		int k;
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int sum;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
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
			sum = 0;
			for (i = n;i >= 2;i--)
			{
				for (j = 0;j < i;j++)
				{
					t = findmin(a[j], i, 1);
					for (l = 0;l < i;l++)
					{
						a[j][l] -= t;
					}
				}
				for (j = 0;j < i;j++)
				{
					t = findmin(a[0][j], i, 100);
					for (l = 0;l < i;l++)
					{
						a[l][j] -= t;
					}
				}

				sum += a[1][1];

				for (j = 1;j < i - 1;j++)
				{
					for (l = 0;l < i;l++)
					{
						a[j][l] = a[j + 1][l];
					}
					for (l = 0;l < i;l++)
					{
						a[l][j] = a[l][j + 1];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
	}
}

