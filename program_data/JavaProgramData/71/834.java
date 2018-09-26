package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int max = new int(int x,int y); //??????????????
		int min = new int(int x,int y);
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
			a = min(l, m);
			b = max(l, m);
			if (k % 4 == 0 && k % 100 != 0 || k % 400 == 0) //???????
			{
				if ((a == 1 && b == 4) || (a == 1 && b == 7) || (a == 4 && b == 7) || (a == 2 && b == 8) || (a == 3 && b == 11) || (a == 9 && b == 12))
				{
					if (i == 1)
					{
						System.out.print("YES");
					}
					else
					{
						System.out.print("\nYES");
					}
				}
				else
				{
					if (i == 1)
					{
						System.out.print("NO");
					}
					else
					{
						System.out.print("\nNO");
					}
				}
			}
			else
			{
				if ((a == 1 && b == 10) || (a == 2 && b == 3) || (a == 2 && b == 11) || (a == 3 && b == 11) || (a == 4 && b == 7) || (a == 9 && b == 12))
				{
					if (i == 1)
					{
						System.out.print("YES");
					}
					else
					{
						System.out.print("\nYES");
					}
				}
				else
				{
					if (i == 1)
					{
						System.out.print("NO");
					}
					else
					{
						System.out.print("\nNO");
					}
				}
			}
		}
		return 0;
	}
	public static int max(int x,int y) //??max??
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}
	public static int min(int x,int y) //??min??
	{
		int z;
		if (x > y)
		{
			z = y;
		}
		else
		{
			z = x;
		}
		return (z);
	}

}

