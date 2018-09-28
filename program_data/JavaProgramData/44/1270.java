package <missing>;

public class GlobalMembers
{
	public static int invert(int a)
	{
		int b;
		int c = 0;
		int i;
		int j;
		if (a >= 0)
		{
			b = a;
		}
		if (a < 0)
		{
			b = -a;
		}
		while (b > 0)
		{
			c = c * 10 + b % 10;
			b = b / 10;
		}
		if (a >= 0)
		{
			c = c;
		}
		if (a < 0)
		{
			c = -c;
		}
		return c;
	}

	public static void Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",invert(a[i]));
		}
	}
}

