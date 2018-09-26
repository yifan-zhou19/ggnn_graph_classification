package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i = 2;
		int c = 0;
		for (i = 2;i <= x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
			if (2 * i > x)
			{
				c = 1;
			}
		}
		return c;
	}

	public static void Main()
	{
		int a;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (j = 1;4 * j + 2 <= a;j++)
		{
			if (sushu(2 * j + 1) == 0)
			{
				continue;
			}
			else
			{
				if (sushu(a - 1 - 2 * j) != 0)
				{
					System.out.printf("%d %d\n",2 * j + 1,a - 1 - 2 * j);
				}
			}
		}
	}

}

