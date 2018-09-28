package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int e;
	int c = 0;
	int[] a = new int[10];
	int[] b = new int[10];
	int[] d = new int[10];

	double[] s = new double[100];
	double t;
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
		s[c] = Math.sqrt(1.0 * (a[i] - a[j]) * (a[i] - a[j]) + 1.0 * (b[i] - b[j]) * (b[i] - b[j]) + 1.0 * (d[i] - d[j]) * (d[i] - d[j]));
		c++;
		}
	}
	for (e = 1;e <= n * (n - 1) / 2;e++)
	{
		for (c = 0;c < n * (n - 1) / 2 - e;c++)
		{
			if (s[c] < s[c + 1])
			{
			t = s[c + 1];
			s[c + 1] = s[c];
			s[c] = t;
			}
		}
	}
	for (c = 0;c < n * (n - 1) / 2;c++)
	{
		if (s[c] == s[c + 1])
		{
			continue;
		}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			if (s[c] == Math.sqrt(1.0 * (a[i] - a[j]) * (a[i] - a[j]) + 1.0 * (b[i] - b[j]) * (b[i] - b[j]) + 1.0 * (d[i] - d[j]) * (d[i] - d[j])))
			{
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],d[i],a[j],b[j],d[j],s[c]);
			}
		}
	}
	}

	return 0;
	}

}

