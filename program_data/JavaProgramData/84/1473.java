package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int m;
		int a;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		i = 2;
	a = m;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	b = m;
		while (i < n)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		if (a >= b)
		{
			if (m >= a)
			{
				b = a;
		a = m;
			}
			if (m <= b)
			{
			a = a;
			b = b;
			}
			if (m < a && m> b)
			{
			a = a;
			b = m;
			}
		}
			else
			{
				if (m >= b)
				{
			b = b;
			a = m;
				}
				if (m < b && m> a)
				{
			a = b;
			b = m;
				}
				if (m <= a)
				{
			t = b;
			b = a;
			a = t;
				}
			}
			i++;
		}
		System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

