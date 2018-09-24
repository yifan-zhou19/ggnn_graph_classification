package <missing>;

public class GlobalMembers
{
	public static int f(int n,int min)
	{
		int i;
		int result = 1;
		if (n < min)
		{
			return 0;
		}
		for (i = min;i < n;i++)
		{
			if (n % i == 0)
			{
				result += f(n / i, i);
			}
		}
		return result;
	}
	public static void Main()
	{
		int cases;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		while (cases-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(a, 2));
		}
	}
}

