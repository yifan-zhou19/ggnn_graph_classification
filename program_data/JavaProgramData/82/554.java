package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int P;
		int p;
		int x;
		int i;
		int M;
		int m;
		M = 0;
		x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				P = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
			if (P >= 90 && P <= 140 && p >= 60 && p <= 90)
			{
					   x = x + 1;
					   m = x;
			}
			else
			{
					   m = x;
					   x = 0;
			}
			if (m > M)
			{
				M = m;
			}
		}
		System.out.printf("%d",M);
		return 0;
	}

}

