package <missing>;

public class GlobalMembers
{
	public static int qi(int num)
	{
		int a;
		int b;
		a = num / 10;
		b = num - 10 * a;
		if (num % 7 == 0)
		{
			return 1;
		}
			else if (a == 7 || b == 7)
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
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (qi(i) == 0)
			{
				sum = sum + i * i;
			}
		}
			System.out.printf("%d\n",sum);
	return 0;
	}

}

