package <missing>;

public class GlobalMembers
{
	public static int fun(int a,int b)
	{
		if (a == b)
		{
			return 233;
		}
		else
		{
			if ((a == 1 && b == 2) || (a == 0 && b == 1) || (a == 2 && b == 0))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}

	}

	public static int Main()
	{
		int n;
		int i;
		int l;
		int na = 0;
		int nb = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (fun(a, b) == 1)
			{
				na++;
			}
			if (fun(a, b) == 0)
			{
				nb++;
			}
			else
			{
				continue;
			}
		}
		if (na > nb)
		{
			System.out.print("A");
		}
		if (na == nb)
		{
			System.out.print("Tie");
		}
		if (na < nb)
		{
			System.out.print("B");
		}
	}

}

