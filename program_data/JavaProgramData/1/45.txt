package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ways = new int(int a, int min);
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",ways(b, 2));
		}
	}
	public static int ways(int a, int min)
	{
		if (a < min)
		{
			return 0;
		}
		int sum = 0;
		int i;
		for (i = min;i <= Math.sqrt(a * 1.0);i++)
		{
			if (a % i == 0)
			{
				sum = sum + ways(a / i, i);
			}
		}
		return sum + 1;
	}
}

