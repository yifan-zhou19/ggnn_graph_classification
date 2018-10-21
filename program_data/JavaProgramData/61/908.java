package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int fibo(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else if (a[n] == 0)
		{
			a[n] = fibo(n - 1) + fibo(n - 2);
		}
		return a[n];
	}
	public static void Main()
	{
		int n;
		int cases;
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
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fibo(n));
		}
	}
}

