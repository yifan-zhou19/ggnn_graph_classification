package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int y;
		int a;
		int b;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
			{
				if (a == 12 && b == 9 || a == 8 && b == 2 || a == 7 && b == 4 || a == 7 && b == 1 || a == 4 && b == 1 || a == 11 && b == 3 || b == 12 && a == 9 || b == 8 && a == 2 || b == 7 && a == 4 || b == 7 && a == 1 || b == 4 && a == 1 || b == 11 && a == 3)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				if (a == 12 && b == 9 || a == 10 && b == 1 || a == 7 && b == 4 || a == 11 && b == 2 || a == 11 && b == 3 || a == 3 && b == 2 || b == 12 && a == 9 || b == 10 && a == 1 || b == 7 && a == 4 || b == 11 && a == 2 || b == 11 && a == 3 || b == 3 && a == 2)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		return 0;
	}

}

