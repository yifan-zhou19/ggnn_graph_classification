package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		int c = 0;
		int d;
		int n;
		int i;
		int j;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		if (c > 2)
		{
		e = c;
		}
		c = 0;

			for (j = 1;j <= n;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
		if (a == 0)
		{
			c = c + 1;
			continue;
		}
		b = b + 1;


			}
		}
		d = ((n * n - b) - 2 * e) / 2 * (e-2);
		System.out.printf("%d",d);
		return 0;
	}


}

