package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int M;
		int m;
		int n;
		int i;
		int a1;
		int a2;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Integer.parseInt(tempVar3);
		}
		if (a1 > a2)
		{
			M = a1;
			m = a2;
		}
		else
		{
			M = a2;
			m = a1;
		}
		for (i = 3;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (m > a)
			{
				M = M;
				m = m;
			}
			else
			{
				if (a > M)
				{
					m = M;
					M = a;
				}
				else
				{
					M = M;
					m = a;
				}
			}
		}
		System.out.printf("%d\n%d",M,m);
		return 0;
	}
}

