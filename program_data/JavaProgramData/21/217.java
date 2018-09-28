package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[50];
		int i = 0;
		int j;
		int s = 0;
		int t;
		float av;
		float c1;
		float c2;
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
			s += a[i];
		}
		av = (float)s / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[i])
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		c1 = av - a[n - 1];
		c2 = a[0] - av;
		if (c1 > c2)
		{
			System.out.printf("%d\n",a[n - 1]);
		}
		else if (c2 > c1)
		{
			System.out.printf("%d\n",a[0]);
		}
		else
		{
			System.out.printf("%d,%d\n",a[n - 1],a[0]);
		}
	}



}

