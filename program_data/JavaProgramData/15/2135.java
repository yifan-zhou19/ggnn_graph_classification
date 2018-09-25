package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int pi = 0;
		int pj;
		int r = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (pj = 0,j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if (a == 0)
				{
					pj++;
					r++;
				}
			}
			if (pj != 0)
			{
				pi++;
			}
		}
		System.out.printf("%d",(r / 2 - pi) * (pi - 2));
	}

}

