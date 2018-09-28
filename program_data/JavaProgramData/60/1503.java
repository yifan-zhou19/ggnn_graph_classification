package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int echo;
		int i;
		for (i = 2;i <= x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == x)
		{
			echo = 1;
		}
		else
		{
			echo = 0;
		}
		return echo;
	}
	public static int Main()
	{
		int n;
		int i;
		int timer = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			if (prime(i) != 0)
			{
				if (prime(i + 2) != 0)
				{
					System.out.printf("%d %d\n",i,i + 2);
					timer++;
				}
			}
		}
		if (timer == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

