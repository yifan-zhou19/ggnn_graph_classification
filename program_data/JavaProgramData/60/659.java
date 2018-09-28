package <missing>;

public class GlobalMembers
{
	public static int f(int a)
	{
		int i;
		int c;
		int count = 0;
		for (i = 1;i <= a;i++)
		{
			c = a % i;
			if (c == 0)
			{
			count = count + 1;
			}
		}
		if (count == 2)
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
		int i;
		int j;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 5)
		{
			n = n - 2;
			for (i = 1;i <= n;i++)
			{
				j = i + 2;
				c = f(i);
				d = f(j);
				if (c == 1 && d == 1)
				{
				System.out.printf("%d %d\n",i,j);
				}
			}
		}
		else
		{
		System.out.print("empty");
		}
		return 0;
	}
}

