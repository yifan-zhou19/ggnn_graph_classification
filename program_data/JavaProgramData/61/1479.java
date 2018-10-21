package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int x;
		int y;
		int i;
		int e;
		int k;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1)
			{
				System.out.print("1\n");
			}
			else if (a == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				x = 1,y = 1;
				for (k = 3;k <= a;k++)
				{
					e = y;
					y = x + y;
					x = e;
				}
				System.out.printf("%d\n",y);
			}
		}
		return 0;
	}
}

