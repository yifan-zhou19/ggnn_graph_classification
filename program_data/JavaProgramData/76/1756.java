package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int e;
		int m;
		int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int[] a = new int[10001];
			int[] b = new int[10001];
				double[] s = new double[10001];
				double max;
				double min;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(b[i]) = Integer.parseInt(tempVar3);
	}
	}
	for (k = 1;k <= n - 1;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (b[i] > b[i + 1])
			{
		e = b[i];
		b[i] = b[i + 1];
		b[i + 1] = e;
			}
		}
	}
	for (k = 1;k <= n - 1;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (a[i] > a[i + 1])
			{
			t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
			}
		}
	}
	min = a[0];
	max = b[n - 1];
	s[0] = min;
	for (j = 0;j < 2 * (max - min);j++)
	{
		s[j + 1] = s[j] + 0.5;
	}
	for (j = 0;j < 2 * (max - min);j++)
	{
		for (i = 0;i < n;i++)
		{
			if (s[j] <= b[i] != 0 && s[j] >= a[i])
			{
				m = 1;
		   break;
			}
			else
			{
			   m = 0;
			}
		}
		if (m == 0)
		{
			  System.out.print("no");
			break;
		}
	}

	 if (m == 1)
	 {
	System.out.printf("%d %d",a[0],b[n - 1]);
	 }
	return 0;
	}


}

