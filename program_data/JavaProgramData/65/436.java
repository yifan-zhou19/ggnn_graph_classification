package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int sa = 0;
		int sb = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			if (a == 0)
			{
				if (b == 0)
				{
					sa = sa + 1;
					sb = sb + 1;
				}
				else if (b == 1)
				{
					sa = sa + 1;
				}
				else
				{
					sb = sb + 1;
				}
			}
			else if (a == 1)
			{
				if (b == 1)
				{
					sa = sa + 1;
					sb = sb + 1;
				}
				else if (b == 2)
				{
					sa = sa + 1;
				}
				else
				{
					sb = sb + 1;
				}
			}
			else
			{
				if (b == 2)
				{
					sa = sa + 1;
					sb = sb + 1;
				}
				else if (b == 0)
				{
					sa = sa + 1;
				}
				else
				{
					sb = sb + 1;
				}
			}
		}
		if (sa > sb)
		{
			System.out.print("A");
		}
		else if (sa < sb)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

