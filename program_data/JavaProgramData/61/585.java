package <missing>;

public class GlobalMembers
{
	public static int Fibonacci(int x)
	{
		int result = 0;
		if (x == 1 || x == 2)
		{
			result = 1;
			return result;
		}
		else
		{
			result = Fibonacci(x - 1) + Fibonacci(x - 2);
			return result;
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			num[i] = Fibonacci(a[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",num[i]);
		}
		return 0;
	}
}

