package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		if (n > 1)
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int x;
		int[] a = new int[1000];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			x = f(a[i] - 1);
			System.out.printf("%d\n",x);
		}

		return 0;
	}


}

