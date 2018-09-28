package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int m = 0;
		int p = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
			{
				m = m + 0;
				p = p + 0;
			}
			if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				m = m + 1;
				p = p + 0;
			}
			if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1))
			{
				m = m + 0;
				p = p + 1;
			}
		}
		if (m == p)
		{
			System.out.print("Tie");
		}
		if (m > p)
		{
			System.out.print("A");
		}
		if (m < p)
		{
			System.out.print("B");
		}
		return 0;
	}

}

