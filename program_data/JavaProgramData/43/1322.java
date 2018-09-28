package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10001];
		int i;
		int j;
		int k;
		int d;
		int n;
		for (i = 0;i < 10001;i++)
		{
			a[i] = 1;
		}
		for (i = 2;i < 10001;i++)
		{
			if (a[i] != 0)
			{
				d = Math.sqrt(i);
				for (k = 2;k <= d;k++)
				{
					if (i % k == 0)
					{
						break;
					}
				}
				if (k > d)
				{
					for (j = i + i;j < 10001;j += i)
					{
						a[j] = 0;
					}
				}
				else
				{
					a[i] = 0;
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		d = n / 2;
		for (i = 3;i <= d;i += 2)
		{
			if (a[i] != 0)
			{
				if (a[n - i] != 0)
				{
					System.out.printf("%d %d\n",i,n - i);
				}
			}
		}
		return 0;
	}
}

