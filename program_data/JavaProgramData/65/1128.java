package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int p = 0;
		int q = 0;
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
				p += 0;
				q += 0;
			}
			else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				p += 1;
			}
			else if ((a == 1 && b == 0) || (a == 2 && b == 1) || (a == 0 && b == 2))
			{
				q += 1;
			}
		}
		if (p > q)
		{
			System.out.print("A");

		}
		else if (q > p)
		{
			System.out.print("B");
		}
		else if (p == q)
		{
			System.out.print("Tie");
		}
		return 0;

	}


}

