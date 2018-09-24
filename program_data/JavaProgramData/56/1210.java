package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int b;
		int c;
		int d;
		int e;
		int n;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		e = n % 10;
		d = (n % 100 - e) / 10;
		f = e * 10000 + d * 1000 + 100 * c + 10 * b + a;
		for (i = 0;i <= 4;i++)
		{
			if (f % 10 == 0)
			{
				f = f / 10;
			}
		}
			System.out.printf("%d",f);

		return 0;
	}

}

