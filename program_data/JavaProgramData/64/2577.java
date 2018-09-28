package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int i;
		int j;
		int x;
		int m = 0;
		double[][] sun = new double[10][10];
		double[] s = new double[50];
		double k;
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
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		c[i] = Integer.parseInt(tempVar4);
	}
		}
		for (i = 0;i < n;i++)
		{
	for (j = i + 1;j < n;j++)
	{
		sun[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
	}
		}
		for (i = 0;i < n;i++)
		{
	for (j = i + 1;j < n;j++)
	{
	s[m] = sun[i][j];
	m++;
	}
		}
		for (i = 0;i < m;i++)
		{
	for (j = i + 1;j < m;j++)
	{
		if (s[j] > s[i])
		{
	k = s[i];
					s[i] = s[j];
			s[j] = k;
		}
	}
		}
		for (i = 0;i < m;i++)
		{
	if (s[i] == s[i + 1])
	{
		for (j = i + 1;j < m;j++)
		{
	s[j] = s[j + 1];
	i = i - 1;
	m = m - 1;
		}
	}
		}
		for (x = 0;x < m;x++)
		{
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
	if (s[x] == sun[i][j])
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[i],b[i],c[i],a[j],b[j],c[j],sun[i][j]);
	}
		}
	}
		}
		return 0;
	}
}

