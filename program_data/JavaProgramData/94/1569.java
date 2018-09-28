package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[501];
	int i;
	int c;
	int j = 0;
	int m = 0;
	int k = 1;
	for (i = 0;i < n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[n - 1] = Integer.parseInt(tempVar3);
	}
	int[] b = new int[501];
	for (i = 0;i < n;i++)
	{
	if (a[i] % 2 != 0)
	{
	m = m + 1;
	}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] % 2 != 0)
		{
		b[j] = a[i];
		j++;
		}
	}
	for (j = 0;j < m - 1;j++)
	{
		for (i = 0;i < m - k;i++)
		{
			if (b[i] > b[i + 1])
			{
			c = b[i];
			b[i] = b[i + 1];
			b[i + 1] = c;


			}
		}
		k++;
	}
	for (i = 0;i < m - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	System.out.printf("%d",b[m - 1]);
	return 0;
	}


}

