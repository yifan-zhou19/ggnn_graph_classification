package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int[] i = new int[6];
		int d;
		for (d = 0;d < 6;d++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				i[d] = Integer.parseInt(tempVar);
			}
		}
		for (d = 0;d < 6;d++)
		{
			System.out.printf("%d\n",reverse(i[d]));
		}
	}


	public static int reverse(int num)
	{
		int[] a = new int[5];
		int b = 0;
		int n;
		if (num < 0)
		{
			n = (0 - num);
		}
		else
		{
			n = num;
		}
		a[0] = n / 10000;
		a[1] = (n % 10000) / 1000;
		a[2] = (n % 1000) / 100;
		a[3] = (n % 100) / 10;
		a[4] = (n % 10);
		if (n >= 10000)
		{
			if (num >= 0)
			{
				b = a[4] * 10000 + a[3] * 1000 + a[2] * 100 + a[1] * 10 + a[0];
			}
			else
			{
				b = 0 - (a[4] * 10000 + a[3] * 1000 + a[2] * 100 + a[1] * 10 + a[0]);
			}
		}
		else if (n >= 1000)
		{
			if (num > 0)
			{
				b = a[4] * 1000 + a[3] * 100 + a[2] * 10 + a[1];
			}
			else
			{
				b = 0 - (a[4] * 1000 + a[3] * 100 + a[2] * 10 + a[1]);
			}
		}
		else if (n >= 100)
		{
			if (num > 0)
			{
				b = a[4] * 100 + a[3] * 10 + a[2];
			}
			else
			{
				b = 0 - (a[4] * 100 + a[3] * 10 + a[2]);
			}
		}
		else if (n >= 10)
		{
			if (num > 0)
			{
				b = a[4] * 10 + a[3];
			}
			else
			{
				b = 0 - (a[4] * 10 + a[3]);
			}
		}
		else
		{
			if (num >= 0)
			{
				b = a[4];
			}
			else
			{
				b = 0 - a[4];
			}
		}
		return (b);
	}
}

