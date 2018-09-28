package <missing>;

public class GlobalMembers
{
	public static int zhishu(int n)
	{
		int m = 0;
		for (int i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				m++;
			}
		}
		if (m == 0 && n != 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n - 2;i++)
		{
			if (zhishu(i) != 0 && zhishu(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}
}

