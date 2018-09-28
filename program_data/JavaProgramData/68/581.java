package <missing>;

public class GlobalMembers
{
	public static int f(int k)
	{
		int t;
		for (t = 3;t <= Math.sqrt(k);t++)
		{
			if (k % t == 0)
			{
			break;
			}
		}
		if (t <= Math.sqrt(k))
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	public static void Main()
	{
		int x;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (x = 3;x < i / 2;x = x + 2)
			{
				if (f(x) == 0)
				{
					continue;
				}
				else if (f(i - x) == 0)
				{
					continue;
				}
				else
				{
					break;
				}
			}
				System.out.printf("%d=%d+%d\n",i,x,i - x);
		}
	}
}

