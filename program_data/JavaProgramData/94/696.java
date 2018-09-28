package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[500];
	int[] b = new int[500];
	int t = 0;
	int q = 0;
	int e;
	int i;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] % 2 != 0)
		{
		b[t] = a[i];
			t++;
		}
	}

	for (k = 1;k <= t;k++)
	{
		q = 0;
		for (i = 0;i <= t - k;i++)
		{
			if (b[i] > b[q])
			{
				q = i;
			}
		}
		e = b[q];
		b[q] = b[t - k];
		b[t - k] = e;
	}
	System.out.printf("%d",b[0]);
	for (k = 1;k <= t - 1;k++)
	{
		System.out.printf(",%d",b[k]);
	}


		return 0;
	}


}

