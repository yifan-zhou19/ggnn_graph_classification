package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 100 > 0)
		{
			a[0] = n / 100;
			n = n % 100;
		}
		if (n / 50 > 0)
		{
			a[1] = n / 50;
			n = n % 50;
		}
		if (n / 20 > 0)
		{
			a[2] = n / 20;
			n = n % 20;
		}
		if (n / 10 > 0)
		{
			a[3] = n / 10;
			n = n % 10;
		}
		if (n / 5 > 0)
		{
			a[4] = n / 5;
			n = n % 5;
		}
		a[5] = n;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

