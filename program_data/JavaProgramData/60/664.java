package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		if (N >= 5)
		{
			   int check = int n;
			   {
			int n;
			for (n = 3;n <= N - 2;n += 2)
			{
			if (check(n) != 0 && check(n + 2) != 0)
			{
									System.out.printf("%d %d\n",n,n + 2);
			}
			}
			   }
		}
		else
		{
		System.out.print("empty");
		}
	}
	public static int check(int n)
	{
		int i;
		if (n == 3)
		{
			return 1;
		}
		for (i = 2;i <= n - 1;i++)
		{
		if (n % i == 0)
		{
				   return 0;
				   break;
		}
		}
		if (i < n)
		{
			   return 0;
		}
		else
		{
			   return 1;
		}
	}
}

