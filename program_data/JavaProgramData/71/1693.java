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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
			{
				if ((b == 1 && c == 4) || (b == 1 && c == 7) || (b == 4 && c == 7) || (b == 2 && c == 8) || (b == 9 && c == 12) || (b == 3 && c == 11) || (c == 1 && b == 4) || (c == 1 && b == 7) || (c == 4 && b == 7) || (c == 2 && b == 8) || (c == 9 && b == 12) || (c == 3 && b == 11))
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
				if ((b == 2 && c == 3) || (b == 2 && c == 11) || (b == 3 && c == 11) || (b == 1 && c == 10) || (b == 9 && c == 12) || (b == 4 && c == 7) || (c == 2 && b == 3) || (c == 2 && b == 11) || (c == 3 && b == 11) || (c == 1 && b == 10) || (c == 9 && b == 12) || (c == 4 && b == 7))
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

