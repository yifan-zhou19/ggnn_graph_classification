package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number = new int(int n, int low);
		int n;
		int i;
		int data;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data = Integer.parseInt(tempVar2);
			}
			ans = number(data, 2);
			System.out.printf("%d\n", ans);
		}
	}
	public static int number(int n, int low)
	{
		int j;
		int ans;
		ans = 0;
		for (j = low ; j * j <= n; j++)
		{
			if (n % j == 0)
			{
				ans = ans + number(n / j, j);
			}
		}
		ans = ans + 1;
		return ans;
	}
}

