package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Fibonacci = int n;
		int n;
		int i;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n",Fibonacci(a[i - 1]));
		}
		return 0;
	}

	public static int Fibonacci(int n)
	{
		int a;
		if (n == 1)
		{
			a = 1;
		}
		else
		{
		if (n == 2)
		{
			a = 1;
		}
		else
		{
		a = Fibonacci(n - 1) + Fibonacci(n - 2);
		}
		}
		return (a);
	}
}

