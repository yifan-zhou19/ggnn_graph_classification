package <missing>;

public class GlobalMembers
{
	public static char infect(tangible.RefObject<String> a, int x, int y, int n)
	{
		if (x - 1 >= 0)
		{
			if (*(a.argValue.Substring(100) * (x - 1) + y) == '.')
			{
				*(a.argValue.Substring(100) * (x - 1) + y) = 'p';
			}
		}
		if (x + 1 < n)
		{
			if (*(a.argValue.Substring(100) * (x + 1) + y) == '.')
			{
				*(a.argValue.Substring(100) * (x + 1) + y) = 'p';
			}
		}
		if (y - 1 >= 0)
		{
			if (*(a.argValue.Substring(100) * x + y - 1) == '.')
			{
				*(a.argValue.Substring(100) * x + y - 1) = 'p';
			}
		}
		if (y + 1 < n)
		{
			if (*(a.argValue.Substring(100) * x + y + 1) == '.')
			{
				*(a.argValue.Substring(100) * x + y + 1) = 'p';
			}
		}
	}
	public static char one_day(tangible.RefObject<String> a, int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(a.argValue.Substring(100) * i + j) == '@')
				{
					infect(a, i, j, n);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(a.argValue.Substring(100) * i + j) == 'p')
				{
					*(a.argValue.Substring(100) * i + j) = '@';
				}
			}
		}

	}

	public static int count(tangible.RefObject<String> a, int n)
	{
		int i;
		int j;
		int res = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(a.argValue.Substring(100) * i + j) == '@')
				{
					res++;
				}
			}
		}
		return res;

	}
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		int day;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		while (--day != 0)
		{
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		one_day(tempRef_a, n);
		a = tempRef_a.argValue;
		}
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
		System.out.printf("%d\n",count(tempRef_a2, n));
		a = tempRef_a2.argValue;

	}

}

