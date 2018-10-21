package <missing>;

public class GlobalMembers
{
	public static int su(int x)
	{
		int i;
		int j = 0;
		for (i = 2;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				j++;
			}
		}
		if (j == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i + 2 <= n;i++)
		{
			if (su(i) == 1 && su(i + 2) == 1)
			{
				z++;
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		if (z == 0)
		{
			System.out.print("empty");
		}
	}
}

