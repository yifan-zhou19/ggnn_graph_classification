package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int fun = new int(int n,int begin);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fun(n, 2));
		}
		return 0;
	}
	public static int fun(int n,int begin)
	{
		int i;
		int result = 1;
		for (i = begin;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				result += fun(n / i, i);
			}
		}
		return result;
	}
}

