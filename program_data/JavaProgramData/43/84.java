package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a += 2)
		{
			for (i = 2;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(a))
			{
				b = m - a;
			}
			else
			{
				continue;
			}

			for (i = 2;i <= Math.sqrt(b);i++)
			{

				if (b % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(b))
			{
				System.out.printf("%d %d\n",a,b);
			}

		}
		return 0;
	}
}

