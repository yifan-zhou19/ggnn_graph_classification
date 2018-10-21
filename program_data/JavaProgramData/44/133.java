package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int t;
		t = num;
		if (num < 0)
		{
			num = -num;
		}
		a = num / 10000;
		b = num / 1000 - 10 * a;
		c = num / 100 - 100 * a - 10 * b;
		d = num / 10 - 1000 * a - 100 * b - 10 * c;
		e = num - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a == 0)
		{
			if (b != 0)
			{
			  num = b + 10 * c + 100 * d + e * 1000;
			}
			else
			{
				if (c != 0)
				{
					  num = c + 10 * d + 100 * e;
				}
				else
				{
					  if (d != 0)
					  {
						 num = 10 * e + d;
					  }
					  else
					  {
						 num = e;
					  }
				}
			}
		}
		else
		{
			num = 100 * c + 10 * b + a + 10000 * e+1000 * d;
		}
		if (t >= 0)
		{
			return (num);
		}
		if (t < 0)
		{
			return (-num);
		}
	}
	public static int i;
	public static int[] a = new int[6];
	public static int Main()
	{
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
			a[i] = reverse(a[i]);
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

