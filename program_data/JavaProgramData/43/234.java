package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int su = int x;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			j = n - i;
			if (su(i) != 0 && su(j) != 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
	}
	public static int su(int x)
	{
		int i;
		int z = 1;
		if (x == 2)
		{
			z = 1;
		}
		else
		{
			for (i = 2;i <= Math.sqrt(x);i++)
			{
				if (x % i == 0)
				{
					z = 0;
					break;
				}
			}
		}
		return z;
	}
}

