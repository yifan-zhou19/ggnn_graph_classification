package <missing>;

public class GlobalMembers
{
	public static int fuck(int a)
	{
		for (int i = 2;i <= a - 1;i++)
		{
			if (a % i == 0)
			{
			return 0;
			}
			else
			{
				if (i == a - 1)
				{
				return 1;
				}
				else
				{
				continue;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 2;i <= n - 2;i++)
		{
			if (fuck(i) == 1 && fuck(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				a = a + 1;
			}
			else
			{
			continue;
			}
		}
		if (a == 0)
		{
		System.out.print("empty");
		}
		else
		{
		return 0;
		}
	}
}

