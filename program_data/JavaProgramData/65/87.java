package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sa = 0;
		int sb = 0;
		int a;
		int b;
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
			if (a + b == 1)
			{
				if (a == 0)
				{
					sa++;
				}
				else if (b == 0)
				{
					sb++;
				}
			}
			else if (a + b == 3)
			{
				if (a == 1)
				{
					sa++;
				}
				else if (b == 1)
				{
					sb++;
				}
			}
			else if (a + b == 2)
			{
				if (a == 2)
				{
					sa++;
				}
				else if (b == 2)
				{
					sb++;
				}
			}
		}

		if (sa > sb)
		{
			System.out.print("A\n");
		}
		else if (sa < sb)
		{
			System.out.print("B\n");
		}
		else if (sa == sb)
		{
			System.out.print("Tie\n");
		}

		return 0;
	}

}

