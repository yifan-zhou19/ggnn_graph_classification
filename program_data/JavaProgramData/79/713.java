package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[320];
	int[][] b = new int[2][20];
	int g = 0;
	int q;
	int i;
	int j;
	int m;
	int n;
	int mj = 0;
	do
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[0][g] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[1][g] = Integer.parseInt(tempVar2);
		}
		g++;
	}while (b[0][g - 1] != 0 && b[1][g - 1] != 0);

	q = g - 1;
	for (g = 0;g < q;g++)
	{
		m = b[1][g];
		n = b[0][g];
			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}
			for (i = 1,j = 0,mj = 0;j < n - 1;i++)
			{
				if (i > n)
				{
					i = i - n;
				}
				if (a[i] != 0)
				{
					mj = mj + 1;
					if (mj % m == 0)
					{
						a[i] = 0;
						j++;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%d\n",a[i]);
				}
			}
	}
	}
}

