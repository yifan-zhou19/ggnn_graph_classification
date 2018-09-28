package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			if (p == q)
			{
			continue;
			}
			if ((p == 0 && q == 1) || (p == 1 && q == 2) || (p == 2 && q == 0))
			{
			m++;
			}
			else
			{
			m--;
			}
		}
		if (m == 0)
		{
		System.out.print("Tie");
		}
		if (m > 0)
		{
		System.out.print("A");
		}
		if (m < 0)
		{
		System.out.print("B");
		}
		return 0;

	}
}

