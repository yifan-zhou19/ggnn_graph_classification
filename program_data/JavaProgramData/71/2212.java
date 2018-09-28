package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int y;
		int a;
		int b;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int c = 0;
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
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				if (a > b)
				{
					for (j = 0;j < a - b;j++)
					{
						c += m[b + j - 1];
					}
					if (c % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (a < b)
				{
					for (j = 0;j < b - a;j++)
					{
						c += m[a + j - 1];
					}
					if (c % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
			else
			{
				if (a > b)
				{
					for (j = 0;j < a - b;j++)
					{
						c += m1[b + j - 1];
					}
					if (c % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (a < b)
				{
					for (j = 0;j < b - a;j++)
					{
						c += m1[a + j - 1];
					}
					if (c % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
		}
		return 0;
	}

}

