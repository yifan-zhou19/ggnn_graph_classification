package <missing>;

public class GlobalMembers
{
	public static int hui(int x)
	{
		int i;
		int j;
		String a = new String(new char[10]);
		a = String.format("%d", x);
		for (i = 0, j = a.length() - 1;i < j;i++, j--)
		{
			if (a.charAt(i) != a.charAt(j))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int su(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int m;
		int n;
		int no = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (m;m <= n;m++)
		{
			if ((no != 0) && (hui(m) == 1 && su(m) == 1))
			{
				System.out.printf(",%d",m);
			}
			if ((no == 0) && (hui(m) == 1 && su(m) == 1))
			{
				System.out.printf("%d",m);
				no++;
			}
		}
		if (no == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

