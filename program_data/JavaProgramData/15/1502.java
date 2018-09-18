package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int x;
		int e;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		x = m * m;
		for (i = 1;i <= x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				e = Integer.parseInt(tempVar2);
			}
			if (e == 0)
			{
				a = i;
				break;
			}
		}
		for (i = a + 1;i <= x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				e = Integer.parseInt(tempVar3);
			}
			if (e == 0)
			{
				b = i;
			}
		}
		c = a % m;
		d = b % m;
		c = d - c - 1;
		a = a / m;
		b = b / m;
		d = b - a - 1;
		System.out.printf("%d",c * d);
		return 0;
	}
}

