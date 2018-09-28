package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int z;
		int m;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			y = i % 7;
			x = i % 10;
			z = i - x;
			m = z / 10;
			if (x == 7 || y == 0 || m == 7)
			{
				continue;
			}
			sum = sum + i * i;
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

