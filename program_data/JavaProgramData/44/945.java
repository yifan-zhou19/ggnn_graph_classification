package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int c;
		if (n == 0 || n == -0)
		{
			c = 0;
		}
		if ((n >= 1 && n <= 9) || (n >= -9 && n <= -1))
		{
			c = Math.abs(n);
		}
		if ((n >= 10 && n <= 99) || (n >= -99 && n <= -10))
		{
			c = (Math.abs(n) % 10) * 10 + Math.abs(n) / 10;
		}
		if ((n >= 100 && n <= 999) || (n >= -999 && n <= -100))
		{
			c = ((Math.abs(n) % 100) % 10) * 100 + ((Math.abs(n) % 100) / 10) * 10 + Math.abs(n) / 100;
		}
		if ((n >= 1000 && n <= 9999) || (n >= -9999 && n <= -1000))
		{
			c = (((Math.abs(n) % 1000) % 100) % 10) * 1000 + (((Math.abs(n) % 1000) % 100) / 10) * 100 + ((Math.abs(n) % 1000) / 100) * 10 + Math.abs(n) / 1000;
		}
		if ((n >= 10000 && n <= 99999) || (n >= -99999 && n <= -10000))
		{
			c = ((((Math.abs(n) % 10000) % 1000) % 100) % 10) * 10000 + ((((Math.abs(n) % 10000) % 1000) % 100) / 10) * 1000 + (((Math.abs(n) % 10000) % 1000) / 100) * 100 + ((Math.abs(n) % 10000) / 1000) * 10 + Math.abs(n) / 10000;
		}
		if (n < 0)
		{
			c = -c;
		}
		return (c);
	}
	public static void Main()
	{
		int n;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",f(n));
		}
	}
}

