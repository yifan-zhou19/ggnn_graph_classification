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
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == b)
			{
				continue;
			}
			else if (a == 0 && b == 1)
			{
				sa++;
			}
			else if (a == 1 && b == 0)
			{
				sb++;
			}
			else if (a == 1 && b == 2)
			{
				sa++;
			}
			else if (a == 2 && b == 1)
			{
				sb++;
			}
			else if (a == 2 && b == 0)
			{
				sa++;
			}
			else if (a == 0 && b == 2)
			{
				sb++;
			}
		}
		if (sa > sb)
		{
			System.out.print("A\n");
		}
		else if (sb > sa)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
	}

}

