package <missing>;

public class GlobalMembers
{
	public static int fibo(int n)
	{
		if (n == 1 || n == 2)
		{
			return (1);
		}
		return (fibo(n - 1) + fibo(n - 2));
	}
	public static void Main()
	{
		int n;
		int i;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fibo(a));
		}
	}
}

