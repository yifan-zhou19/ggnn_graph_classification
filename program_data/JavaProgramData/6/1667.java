package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int[] b = new int[100];
	int m;
	int j;
	int r;
	int n;
	int k;
	int p;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p = Integer.parseInt(tempVar);
	}
	for (m = 0;m < p;m++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (j = 0;j < n;j++)
	{
		for (r = 0;r < k;r++)
		{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[j][r] = Integer.parseInt(tempVar4);
	}
		}
	}
	b[m] = 0;
	for (j = 0;j < 1;j++)
	{
		for (r = 0;r < k;r++)
		{
	b[m] = b[m] + a[j][r];
		}
	}
	for (j = n - 1;j > n - 2;j--)
	{
		for (r = 0;r < k;r++)
		{
	b[m] = b[m] + a[j][r];
		}
	}
	for (r = 0;r < 1;r++)
	{
		for (j = 1;j < n - 1;j++)
		{
	b[m] = b[m] + a[j][r];
		}
	}
	for (r = k - 1;r > k - 2;r--)
	{
		for (j = 1;j < n - 1;j++)
		{
	b[m] = b[m] + a[j][r];
		}
	}

	}
	for (m = 0;m < p;m++)
	{
		System.out.printf("%d\n",b[m]);
	}

	return 0;
	}


}

