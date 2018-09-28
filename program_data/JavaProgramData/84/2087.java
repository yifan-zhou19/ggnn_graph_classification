package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int m1;
		int m2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
			if (a > b)
			{
				m1 = a;
				m2 = b;
			}
			else
			{
				m1 = b;
				m2 = a;
			}
		for (i = 1;i < n - 1;i++)
		{

			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (c > m1)
			{
				m2 = m1;
				m1 = c;
			}
			if (m2 < c && c < m1)
			{
				m2 = c;
			}
			if (m2 > c)
			{
				continue;
			}
		}
		System.out.printf("%d\n%d",m1,m2);

		return 0;
	}


}

