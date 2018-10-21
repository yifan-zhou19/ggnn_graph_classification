package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int s = 0;
		int e = 0;
		int i;
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
			if (a == b)
			{
				s += 0;
				e += 0;
			}
			else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				s += 1;
			}
			else
			{
				e += 1;
			}
		}
		if (s == e)
		{
			System.out.print("Tie\n");
		}
		else if (s > e)
		{
			System.out.print("A\n");
		}
		else
		{
			System.out.print("B\n");
		}
		return 0;
	}
}

