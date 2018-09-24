package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int i;
	int j;
	int l;
	int sum = 0;
	int[][] a = new int[100][100];
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < m;j++)
		{
			for (l = 0;l < n;l++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[j][l] = Integer.parseInt(tempVar4);
			}
			}

		}
		if ((m != 1) && (n != 1))
		{
		for (l = 0;l < n;l++)
		{
		sum = sum + a[0][l];
		sum = sum + a[m - 1][l];
		}
		for (j = 1;j < m - 1;j++)
		{
		sum = sum + a[j][0];
		sum = sum + a[j][n - 1];
		}
		b[i] = sum;
		sum = 0;
		}
		else if (m = 1)
		{
			for (l = 0;l < n;l++)
			{
			sum = sum + a[0][l];
			b[i] = sum;
			sum = 0;
			}
		}
		else if (n = 1)
		{
			for (j = 0;j < m;j++)
			{
			sum = sum + a[j][0];
			b[i] = sum;
			sum = 0;
			}
		}
	}
	for (i = 0;i < k;i++)
	{
	System.out.printf("%d\n",b[i]);
	}
	return 0;
	}
}

