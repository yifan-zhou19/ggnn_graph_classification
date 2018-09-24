package <missing>;

public class GlobalMembers
{
	public static int ju(int x)
	{
		int j;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int num;
		int flag = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= num / 2;i = i + 2)
		{
			if (ju(i) == 1)
			{
			b = num - i;
			if (ju(b) == 1)
			{
				System.out.printf("%d %d",i,b);
				System.out.print("\n");

			}
			}

		}
		return 0;
	}

}

