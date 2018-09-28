package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int king = new int(int n, int m);
		int n;
		int m;

		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			System.out.printf("%d\n",king(n, m));
		}
		return 0;
	}

	public static int king(int n,int m)
	{
		int z;
		if (n == 1)
		{
			return 1;
		}
		if (n > 1)
		{
			z = (m % n + king(n - 1, m)) % n;
			if (z == 0)
			{
				z = n;
			}
			return z;
		}
	}
}

