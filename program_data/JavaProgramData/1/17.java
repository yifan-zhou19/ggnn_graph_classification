package <missing>;

public class GlobalMembers
{
	public static int fun(int x,int y)
	{
		int i;
		int sum = 0;
		for (i = x;i * i <= y;i++)
		{
			if (y % i == 0)
			{
			sum++;
			sum += fun(i, y / i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			n--;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			sum = 1;
			sum += fun(2, i);
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

