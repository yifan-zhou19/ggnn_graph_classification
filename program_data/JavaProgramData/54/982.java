package <missing>;

public class GlobalMembers
{
	public static int Num(int apple,int n,int k)
	{
		int t;
		for (t = 2;t <= n;t++)
		{
			if (apple % (n - 1) == 0)
			{
				apple = apple / (n - 1) * n + k;
			}
			else
			{
				apple = 0;
				break;
			}
		}
		return apple;
	}

	public static int Main()
	{
		int n;
		int k;
		int i;
		int apple;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i > 0;i++)
		{
			apple = n * i + k;
			if (Num(apple, n, k) != 0)
			{
				System.out.printf("%d",Num(apple, n, k));
				break;
			}
		}
		return 0;
	}

}

