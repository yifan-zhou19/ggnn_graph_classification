package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[20];
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",f(sz[i]));
		}
		return 0;
	}
}

