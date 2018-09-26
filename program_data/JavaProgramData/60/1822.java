package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int sum;
		sum = 0;
		for (i = 1;i <= x;i++)
		{
			if (x % i == 0)
			{
				sum++;
			}
		}
		return sum;
	}
	public static int Main()
	{
		int m;
		int x;
		int num;
		num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (x = 2;x <= m - 2;x++)
		{
			if (sushu(x) + sushu(x + 2) == 4)
			{
				System.out.printf("%d %d\n",x,x + 2);
				num++;
			}
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

