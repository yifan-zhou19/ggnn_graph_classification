package <missing>;

public class GlobalMembers
{
	public static int num(int a)
	{
		int b;
		b = Math.abs(a);
		while (b % 10 == 0)
		{
			b = b / 10;
		}
		if (a > 0)
		{
			return b;
		}
		else
		{
			return -b;
		}
	}
	public static int reverse(int b) //???a??keyi
	{
		int c = 0;
		int d;
		d = Math.abs(b);
		while (d > 0)
		{
			c = c * 10 + d % 10;
			d = d / 10;
		}
		if (b > 0)
		{
			return c;
		}
		else
		{
			return -c;
		}
	}
	public static int Main()
	{
		int i = 0;
		int x;
		int[] out = new int[6];
		for (;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			out[i] = reverse(num(x));
		}
		for (i = 0;i < 6;i++)
		{

		System.out.printf("%d\n",out[i]);
		}
		return 0;
	}

}

