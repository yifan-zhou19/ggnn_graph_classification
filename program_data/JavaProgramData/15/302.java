package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b;
		int c;
		int d;
		int e;
		int f;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f = 0;
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (b == 0)
			{
				f = i;
				sum += i;
				a += 1;
			}
		}
		c = sum / a * 2 - f;
		d = f / n - c / n + 1;
		e = (a - 2 * d) / 2;
		System.out.printf("%d",(d - 2) * e);
	}
}

