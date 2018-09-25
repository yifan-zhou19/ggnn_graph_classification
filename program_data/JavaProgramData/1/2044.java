package <missing>;

public class GlobalMembers
{
	public static int count;
	public static void solve(int num,int a,int m)
	{
		int i;
		if (num == 1)
		{
		count++;
		return;
		}
		for (i = 2;i <= num;i++)
		{
			if (i >= a != 0 && (num % i) == 0)
			{
			solve(num / i, i, m + 1);
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

		int num;
		int a;
		count = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
		solve(num, 0, 1);
		System.out.printf("%d\n",count);
		}
	}
}

