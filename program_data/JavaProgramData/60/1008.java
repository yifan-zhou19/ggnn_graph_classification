package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int f = int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;(i + 2) <= n;i++)
		{
			if (f(i) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

	public static int f(int i)
	{
		int s = int i;
		if (s(i) != 0 && s(i + 2) != 0)
		{
			return (i);
		}
		else
		{
			return (0);
		}
	}

	public static int s(int n)
	{
		int k;
		int num = 0;
		for (k = 1;k <= n;k++)
		{
			if (n % k == 0)
			{
				num++;
			}
		}
		if (num == 2)
		{
			return (n);
		}
		else
		{
			return (0);
		}
	}


}

