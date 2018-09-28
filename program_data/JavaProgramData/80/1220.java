package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		i = 1;
		m = 0;
		while (i < a)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				m = m + 366;
			}
		else
		{
			m = m + 365;
		}
		i = i + 1;
		}
		j = 1;
		while (j < b)
		{
			if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10))
			{
				m = m + 31;
			}
		else if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
		{
			m = m + 30;
		}
			else if ((j == 2) && (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				m = m + 29;
			}
			else
			{
				m = m + 28;
			}
			j = j + 1;
		}
		m = m + c;
		k = 1;
		n = 0;
		while (k < d)
		{
			if ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0))
			{
				n = n + 366;
			}
		else
		{
			n = n + 365;
		}
		k = k + 1;
		}
		l = 1;
		while (l < e)
		{
			if ((l == 1) || (l == 3) || (l == 5) || (l == 7) || (l == 8) || (l == 10))
			{
				n = n + 31;
			}
		else if ((l == 4) || (l == 6) || (l == 9) || (l == 11))
		{
			n = n + 30;
		}
			else if ((l == 2) && (d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
			{
				n = n + 29;
			}
			else
			{
				n = n + 28;
			}
			l = l + 1;
		}
		n = n + f;
		System.out.printf("%d",n - m);
		return 0;
	}
}

