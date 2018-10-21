package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			int res = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			for (int i = 0;i < p;i++)
			{
				for (int j = 0;j < q;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						tmp = Integer.parseInt(tempVar4);
					}
					if (i == 0 || j == 0 | i == p - 1 || j == q - 1)
					{
						res += tmp;
					}
				}
			}
			System.out.printf("%d\n",res);
		}
		return 0;
	}
}

