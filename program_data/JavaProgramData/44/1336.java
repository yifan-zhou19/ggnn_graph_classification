package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int m;
		int i;
		int b;
		int j;
		int h;
		if (n >= 0)
		{
		m = n;
		}
		else
		{
		m = -n;
		}
		int a = 0;
		b = 0;

		for (;m > 0;)
		{
			m /= 10;
		a++;
		}
		if (n >= 0)
		{
		m = n;
		}
		else
		{
		m = -n;
		}
		for (i = 1;i <= a;i++)
		{
			h = 1;
			  for (j = 1;j <= (a - i);j++)
			  {
				  h *= 10;
			  }
			  b += (m - (m / 10) * 10) * h;
			  m /= 10;
		}
		if (n >= 0)
		{
		return b;
		}
		else
		{
		return -b;
		}
	}

	public static int Main()
	{
		int i;
		for (i = 0;i < 6;i++)
		{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}
		System.in.read();
		System.in.read();
	}
}

