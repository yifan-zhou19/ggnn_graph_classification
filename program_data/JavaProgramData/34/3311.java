package <missing>;

public class GlobalMembers
{
	public static void solve(int n)
	{
	if (n == 2)
	{
		System.out.print("2/2=1\n");
	}
	else if (n % 2 == 0)
	{
		System.out.printf("%d/2=%d\n",n,n / 2);
		solve(n / 2);
	}
	else
	{
		System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
		solve(n * 3 + 1);
	}
	}
	public static void Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
		System.out.print("End");
	}
	else
	{
		solve(n);
		System.out.print("End");
	}
	}

}

