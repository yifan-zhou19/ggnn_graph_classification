package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = (n / 10) - ((n / 100) * 10);
		c = n % 10;
		if (n / 100 != 0)
		{
			a[0] = n / 100;
		}
		else
		{
			a[0] = 0;
		}
		if (b == 1 || b == 3 || b == 6 || b == 8)
		{
			a[3] = 1;
		}
		else
		{
			a[3] = 0;
		}
		if (b == 2 || b == 3 || b == 7)
		{
			a[2] = 1;
		}
		else if (b == 4 || b == 9)
		{
			a[2] = 2;
		}
		else
		{
			a[2] = 0;
		}
		if (b >= 5)
		{
			a[1] = 1;
		}
		else
		{
			a[1] = 0;
		}
		if (c < 5)
		{
			a[5] = c;
		}
		else if (c > 5)
		{
			a[5] = c - 5;
		}
		else
		{
			a[5] = 0;
		}
		if (c >= 5)
		{
			a[4] = 1;
		}
		else
		{
			a[4] = 0;
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

