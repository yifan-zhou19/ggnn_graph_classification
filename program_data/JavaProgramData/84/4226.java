package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int m1;
		int m2;
		int i;
		i = 3;
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
		if (b > c)
		{
				m1 = b;
				m2 = c;
		}
			else
			{
				m1 = c;
				m2 = b;
			}
		while (i <= a)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			if (x > m1)
			{
				m2 = m1;
				m1 = x;
			}
			else if (x > m2)
			{
				m2 = x;
			}
			else
			{
				x = x;
			}
			i++;
		}
		System.out.printf("%d\n%d\n",m1,m2);
		return 0;
	}





}

