package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int as;
		int bs;
		int tie;
		as = 0;
		bs = 0;
		tie = 0;
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
			if (a == 0 && b == 1)
			{
				as++;
			}
			else if (a == 0 && b == 0)
			{
				tie++;
			}
			else if (a == 1 && b == 1)
			{
				tie++;
			}
			else if (a == 1 && b == 2)
			{
				as++;
			}
			else if (a == 2 && b == 0)
			{
				as++;
			}
			else if (a == 2 && b == 2)
			{
				tie++;
			}
		}
		bs = n - as - tie;
		if (as > bs)
		{
			System.out.print("A");
		}
		else if (as - bs == 0)
		{
			System.out.print("Tie");
		}
		else if (as < bs)
		{
			System.out.print("B");
		}
		return 0;
	}
}

