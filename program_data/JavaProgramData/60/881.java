package <missing>;

public class GlobalMembers
{
	public static int issushu(int x)
	{
		int j;
		if (x < 2)
		{
			return 0;
		}
		else if (x == 2)
		{
			return 1;
		}
		else
		{
			for (j = 2;j < x;j++)
			{
				if (x % j == 0)
				{
					return 0;
				}
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n - 2;i++)
		{
			if (issushu(i) != 0 && issushu(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("empty");
		}


		return 0;
	}
}

