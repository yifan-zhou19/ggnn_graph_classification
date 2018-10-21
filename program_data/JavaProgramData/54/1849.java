package <missing>;

public class GlobalMembers
{
	public static int p(int n,int k)
	{
		if (k == 0)
		{
			return 1;
		}
		return n * p(n, k - 1);
	}

	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d", p(n, n) - k * (n - 1));
		return 0;
	}
}

