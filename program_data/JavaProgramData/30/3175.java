package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = n;
		while (i > 0)
		{
			x = i % 7;
				y = i / 10;
			z = i % 10;

			if (x == 0 || y == 7 || z == 7)
			{
								i--;
				continue;
			}
			sum = sum + i * i;
			i--;
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

