package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			e = Integer.parseInt(tempVar2);
		}
		b = e;
		c = e;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a >= b)
			{
				d = b;
				b = a;
			if (b > d)
			{
				c = d;
			}
			}
			else if (a < b && a> c)
			{
				e = a;
			}
			if (e > c)
			{
				c = e;
			}

		}
		System.out.printf("%d\n%d\n",b,c);
		return 0;
	}
}

