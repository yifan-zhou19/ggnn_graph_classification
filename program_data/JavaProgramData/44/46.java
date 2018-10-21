package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int disorder = int n;
		int[] a = new int[6];
		int i;
		int[] b = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		b[i] = disorder(a[i]);
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}

	public static int disorder(int n)
	{
		int a;
		int c;
		if (n > 0)
		{
			a = n;
			c = 0;
		while (a > 0)
		{
		c = c * 10 + a % 10;
		a /= 10;
		}
		return c;
		}

		if (n < 0)
		{
			a = -n;
			c = 0;
		while (a > 0)
		{
		c = c * 10 + a % 10;
		a /= 10;
		}
		return -c;
		}
		if (n == 0)
		{
			return 0;
		}
	}
}

