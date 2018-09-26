package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int[] a = new int[max];
	int[] b = new int[max];
	int m = 0;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (i = 0;i < N;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		if (a[i] % 2 != 0)
		{
			b[m] = a[i];
			m++;
		}
	}
	int e;
	for (int k = 1;k <= m;k++)
	{
		for (i = 0;i < m - k;i++)
		{
			if (b[i] > b[i + 1])
			{
				e = b[i + 1];
				b[i + 1] = b[i];
				b[i] = e;
			}
		}
	}
	for (j = 0;j < m;j++)
	{
		if (j == 0)
		{
			System.out.printf("%d",b[j]);
		}
		else
		{
			System.out.printf(",%d",b[j]);
		}
	}
	return 0;
	}
}

