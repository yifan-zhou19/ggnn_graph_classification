package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int o1 = 0;
		int p1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			int o;
			int p;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				o = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
			if (o == p)
			{
				;
			}
			else if ((o == 0 && p == 1) || (o == 1 && p == 2) || (o == 2 && p == 0))
			{
				o1++;
			}
			else
			{
				p1++;
			}
		}
		if (o1 > p1)
		{
			System.out.print("A\n");
		}
		else if (p1 > o1)
		{
			System.out.print("B\n");
		}
		else
		{
			System.out.print("Tie\n");
		}
	}
}

