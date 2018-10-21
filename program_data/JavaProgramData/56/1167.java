package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int y = 0;
		int z = 0;
		for (int i = 0;i < 5;i++)
		{
			if (n / 10 != 0)
			{
				y = n % 10;
				z = 10 * z + 10 * y;
			}
			if (n / 10 == 0)
			{
				z += n;
			}
			n = n / 10;
		}
		System.out.printf("%d",z);
		return 0;
	}
}

