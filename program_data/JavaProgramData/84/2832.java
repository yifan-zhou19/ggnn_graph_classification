package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int m = 0;
		int p = 0;
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
		m = b;
		for (i = 2;i <= a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			if (n > m)
			{
				p = m;
				m = n;
			}
			if (n > p && n < m)
			{
				p = n;
				m = m;
			}
			if (n < p)
			{
				p = p;
				m = m;
			}
		}
		System.out.printf("%d\n",m);

		 System.out.printf("%d\n",p);
		return 0;
	}
}

