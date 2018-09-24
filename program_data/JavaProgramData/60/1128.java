package <missing>;

public class GlobalMembers
{
	public static int zhi(int w)
	{
		int p = 2;
		int bi = 0;
		for (p = 2;p <= w / 2;p++)
		{
			if (w % p == 0)
			{
				bi = 1;
				break;
			}
		}
		if (bi == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
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

		int c = 0;
		for (i = 2;i <= n - 2;i++)
		{
			if (zhi(i) != 0 && zhi(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				c = 1;
			}
		}
		if (c == 0)
		{
		System.out.print("empty");
		}
		return 0;
	}

}

