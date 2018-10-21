package <missing>;

public class GlobalMembers
{
	public static int dd(int n)
	{
		int i;
		int z;
		if (n == 1 || n == 2)
		{
			z = 1;
		}
		else
		{
		z = dd(n - 1) + dd(n - 2);
		}

		return z;

	}

	public static int Main()
	{
		int m;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",dd(a));
		if (i < m - 1)
		{
			System.out.print("\n");
		}
		}

	}
}

