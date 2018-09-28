package <missing>;

public class GlobalMembers
{
	public static int apple(int n, int k)
	{
		if (n == 2)
		{
			return 2 * Math.pow(n,n) - (n - 1) * k;
		}
		else
		{
			return Math.pow(n,n) - (n - 1) * k;
		}
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
		System.out.printf("%d\n", apple(n, k));

		return 0;
	}
}

