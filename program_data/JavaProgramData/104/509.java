package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int t;
		int a;
		int b;
		int i = 0;
		int j = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x < y)
		{
			t = x;
			x = y;
			y = t;
		}
		a = x;
		b = y;
		while (a != 1)
		{
			a = a / 2;
			i = i + 1;
		}
		while (b != 1)
		{
			b = b / 2;
			j = j + 1;
		}
		m = i - j;
		while (m != 0)
		{
			x = x / 2;
			m = m - 1;
		}
		while (x != y)
		{
			x = x / 2;
			y = y / 2;
		}
		System.out.printf("%d\n", x);
		return 0;
	}

}

