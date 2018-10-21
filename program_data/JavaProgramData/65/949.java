package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n;
		int p = 0;
		int q = 0;
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
			if ((a - b == 1) || (b - a == 2))
			{
				q++;
			}
			else if ((b - a == 1) || (a - b == 2))
			{
				p++;
			}
			else if (a == b)
			{
				p = p;
				q = q;
			}
		}
		if (p > q)
		{
			System.out.print("A");
		}
		else if (p < q)
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

