package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int c;
		if (i == 0)
		{
			c = 1;
		}
		else
		{
			c = f(i - 1) * 2;
		}
		return (c);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int c = 0;
		int k = 0;
		int[] a = new int[11];
		int[] b = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		for (i = 1;i < 10;i++)
		{
			if (m / f(i) == 0)
			{
				break;
			}
			a[i] = m / (f(i));
		}
		for (i = 1;i < 10;i++)
		{
			if (n / f(i) == 0)
			{
				break;
			}
			b[i] = n / (f(i));
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					k = i;
					c = 1;
					break;
				}
			}
			if (c > 0)
			{
				break;
			}
		}
		System.out.printf("%d",a[i]);
	}
}

