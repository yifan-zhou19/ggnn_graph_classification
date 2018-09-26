package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		for (i = 3;i <= ((x - 1) / 2);i += 2)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 3;(i + 2) <= n;i += 2)
			{
				if (prime(i) != 0 && prime(i + 2) != 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		return 0;
	}
}

